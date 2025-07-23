package fun.mntale.atdeprecated.config.modules.removed;

import fun.mntale.atdeprecated.config.EnumConfigCategory;
import fun.mntale.atdeprecated.config.IConfigModule;

import fun.mntale.atdeprecated.config.annotations.RemovedEntry;

public class RemovedConfig implements IConfigModule {

    @RemovedEntry(category = {"cat"}, name = "test")
    public boolean removed;

    @Override
    public EnumConfigCategory getCategory() {
        return EnumConfigCategory.REMOVED;
    }

    @Override
    public String getBaseName() {
        return "removed_config";
    }
}