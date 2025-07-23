package fun.mntale.atdeprecated.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    private final File configFile;
    private final List<Module> modules = new ArrayList<>();
    private CommentedFileConfig config;

    public Manager(File configFile) {
        this.configFile = configFile;
    }

    public void registerModule(Module module) {
        modules.add(module);
    }

    public void preload() {
        if (!configFile.exists()) {
            try {
                configFile.getParentFile().mkdirs();
                configFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException("Failed to create config file", e);
            }
        }
        config = CommentedFileConfig.of(configFile);
        config.load();
    }

    public void load() {
        for (Module module : modules) {
            for (Setting<?> setting : module.getSettings()) {
                loadSetting(module, setting);
            }
        }
        save();
    }

    private <T> void loadSetting(Module module, Setting<T> setting) {
        if (setting instanceof RemovedSetting) {
            loadRemovedSetting(module, (RemovedSetting) setting);
            return;
        }
        String path = module.getName() + "." + setting.getKey();
        Object value = config.get(path);
        if (value == null) {
            config.set(path, setting.getDefaultValue());
            config.setComment(path, setting.getComment());
            setting.setValue(setting.getDefaultValue());
        } else {
            // This is a simplification. A real implementation would need to handle type conversion and validation.
            setting.setValue((T) value);
        }
    }

    private void loadRemovedSetting(Module module, RemovedSetting setting) {
        String path = module.getName() + "." + setting.getKey();
        if (config.contains(path)) {
            config.remove(path);
        }
    }

    public void save() {
        for (Module module : modules) {
            for (Setting<?> setting : module.getSettings()) {
                if (setting instanceof RemovedSetting) {
                    continue;
                }
                String path = module.getName() + "." + setting.getKey();
                config.set(path, setting.getValue());
                config.setComment(path, setting.getComment());
            }
        }
        config.save();
    }
}