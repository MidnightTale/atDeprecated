package fun.mntale.atdeprecated.config.modules.features;

import fun.mntale.atdeprecated.config.EnumConfigCategory;
import fun.mntale.atdeprecated.config.IConfigModule;
import fun.mntale.atdeprecated.config.annotations.ConfigInfo;

public class ElytraConfig implements IConfigModule {

    @ConfigInfo(name = "remove-leash-break-check", comments = "Remove leash break check when boost elytra")
    public boolean removeLeashBreakCheck = true;

    @Override
    public EnumConfigCategory getCategory() {
        return EnumConfigCategory.FEATURES;
    }

    @Override
    public String getBaseName() {
        return "elytra";
    }
}