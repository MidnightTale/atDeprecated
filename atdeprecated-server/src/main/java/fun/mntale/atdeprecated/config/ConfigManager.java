package fun.mntale.atdeprecated.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import fun.mntale.atdeprecated.config.annotations.ConfigInfo;
import fun.mntale.atdeprecated.config.annotations.RemovedEntry;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ConfigManager {
    private final File configFile;
    private final List<IConfigModule> modules = new ArrayList<>();
    private CommentedFileConfig config;

    public ConfigManager(File configFile) {
        this.configFile = configFile;
    }

    public void registerModule(IConfigModule module) {
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
        for (IConfigModule module : modules) {
            loadModule(module);
        }
        save();
    }

    private void loadModule(IConfigModule module) {
        for (Field field : module.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(ConfigInfo.class)) {
                loadValue(module, field);
            }
            if (field.isAnnotationPresent(RemovedEntry.class)) {
                for (RemovedEntry removed : field.getAnnotationsByType(RemovedEntry.class)) {
                    String path = String.join(".", removed.category()) + "." + removed.name();
                    if (config.contains(path)) {
                        config.remove(path);
                    }
                }
            }
        }
    }

    private void loadValue(IConfigModule module, Field field) {
        ConfigInfo info = field.getAnnotation(ConfigInfo.class);
        String path = module.getCategory().getKey() + "." + module.getBaseName() + "." + (info.name().isEmpty() ? field.getName() : info.name());
        Object value = config.get(path);
        try {
            if (value == null) {
                config.set(path, field.get(module));
                config.setComment(path, info.comments());
            } else {
                field.set(module, value);
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access config field", e);
        }
    }

    public void save() {
        for (IConfigModule module : modules) {
            for (Field field : module.getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(ConfigInfo.class)) {
                    ConfigInfo info = field.getAnnotation(ConfigInfo.class);
                    String path = module.getCategory().getKey() + "." + module.getBaseName() + "." + (info.name().isEmpty() ? field.getName() : info.name());
                    try {
                        config.set(path, field.get(module));
                        config.setComment(path, info.comments());
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException("Failed to access config field", e);
                    }
                }
            }
        }
        config.save();
    }
}