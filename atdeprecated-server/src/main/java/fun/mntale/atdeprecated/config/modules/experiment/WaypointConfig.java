package fun.mntale.atdeprecated.config.modules.experiment;

import fun.mntale.atdeprecated.config.EnumConfigCategory;
import fun.mntale.atdeprecated.config.IConfigModule;
import fun.mntale.atdeprecated.config.annotations.ConfigInfo;

public class WaypointConfig implements IConfigModule {

    @ConfigInfo(name = "force-enable", comments = "Force enable the /waypoint command and its functionality.")
    public boolean forceEnable = true;

    @Override
    public EnumConfigCategory getCategory() {
        return EnumConfigCategory.EXPERIMENT;
    }

    @Override
    public String getBaseName() {
        return "waypoint";
    }
}