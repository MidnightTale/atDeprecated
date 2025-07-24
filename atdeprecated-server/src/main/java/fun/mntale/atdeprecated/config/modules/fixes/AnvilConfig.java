package fun.mntale.atdeprecated.config.modules.fixes;

import fun.mntale.atdeprecated.config.EnumConfigCategory;
import fun.mntale.atdeprecated.config.IConfigModule;
import fun.mntale.atdeprecated.config.annotations.ConfigInfo;

public class AnvilConfig implements IConfigModule {

    @ConfigInfo(name = "maximum-repair-cost", comments = "The maximum repair cost for the anvil. Set to -1 to disable.")
    public int maximumRepairCost = 40;

    @Override
    public EnumConfigCategory getCategory() {
        return EnumConfigCategory.FIXES;
    }

    @Override
    public String getBaseName() {
        return "anvil";
    }
}