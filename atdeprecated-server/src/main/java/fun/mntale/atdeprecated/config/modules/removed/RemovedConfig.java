package fun.mntale.atdeprecated.config.modules.removed;

import fun.mntale.atdeprecated.config.Module;
import fun.mntale.atdeprecated.config.RemovedSetting;
import fun.mntale.atdeprecated.config.Setting;

import java.util.Collections;
import java.util.List;

public class RemovedConfig implements Module {

    public final Setting<?> removed = new RemovedSetting("cat", "test");

    @Override
    public String getName() {
        return "removed_config";
    }

    @Override
    public List<Setting<?>> getSettings() {
        return Collections.singletonList(removed);
    }
}