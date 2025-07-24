package fun.mntale.atdeprecated.config.modules.features;

import fun.mntale.atdeprecated.config.EnumConfigCategory;
import fun.mntale.atdeprecated.config.IConfigModule;
import fun.mntale.atdeprecated.config.annotations.ConfigInfo;

public class InventoryConfig implements IConfigModule {

    @ConfigInfo(name = "barrel-rows", comments = "Number of rows for barrels. Valid values: 1-6.")
    public int barrelRows = 6;

    @ConfigInfo(name = "enderchest-rows", comments = "Number of rows for ender chests. Valid values: 1-6.")
    public int enderChestRows = 6;

    @Override
    public EnumConfigCategory getCategory() {
        return EnumConfigCategory.FEATURES;
    }

    @Override
    public String getBaseName() {
        return "inventory";
    }
}