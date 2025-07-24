package fun.mntale.atdeprecated.config.modules.experiment;

import fun.mntale.atdeprecated.config.EnumConfigCategory;
import fun.mntale.atdeprecated.config.IConfigModule;
import fun.mntale.atdeprecated.config.annotations.ConfigInfo;

public class RayTrackingEntityTrackerConfig implements IConfigModule {

    @ConfigInfo(name = "enabled", comments = "Enable this to use ray-tracing to cull entities.")
    public boolean enabled = true;

    @ConfigInfo(name = "tracing-distance", comments = "The distance to trace for entities.")
    public int tracingDistance = 64;

    @ConfigInfo(name = "hitbox-limit", comments = "The maximum number of hitboxes to check.")
    public int hitboxLimit = 1000;

    @ConfigInfo(name = "check-interval-ms", comments = "The interval in milliseconds to check for culling.")
    public int checkIntervalMs = 500;

    @Override
    public EnumConfigCategory getCategory() {
        return EnumConfigCategory.EXPERIMENT;
    }

    @Override
    public String getBaseName() {
        return "ray-tracking-entity-tracker";
    }
}