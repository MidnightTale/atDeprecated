package fun.mntale.atdeprecated.config.modules.features;

import fun.mntale.atdeprecated.config.EnumConfigCategory;
import fun.mntale.atdeprecated.config.IConfigModule;
import fun.mntale.atdeprecated.config.annotations.ConfigInfo;

public class DispenserConfig implements IConfigModule {

    @ConfigInfo(name = "place-boat-on-ice", comments = "Allow dispenser to place boats on ice")
    public boolean placeBoatOnIce = true;

    @Override
    public EnumConfigCategory getCategory() {
        return EnumConfigCategory.FEATURES;
    }

    @Override
    public String getBaseName() {
        return "dispenser";
    }
}