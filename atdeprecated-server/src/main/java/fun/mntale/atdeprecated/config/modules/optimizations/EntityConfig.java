package fun.mntale.atdeprecated.config.modules.optimizations;

import fun.mntale.atdeprecated.config.EnumConfigCategory;
import fun.mntale.atdeprecated.config.IConfigModule;
import fun.mntale.atdeprecated.config.annotations.ConfigInfo;

public class EntityConfig implements IConfigModule {

    @ConfigInfo(name = "optimize-chicken-behavior", comments = "Enable this to optimize chicken behavior by removing complex actions like wandering, looking at players, or panicking.")
    public boolean optimizeChickenBehavior = true;

    @ConfigInfo(name = "chicken-egg-lay-interval", comments = "The interval in ticks for how often a chicken checks to lay an egg.")
    public int chickenEggLayInterval = 36000; // 30 minutes

    @ConfigInfo(name = "enable-chicken-egg-laying", comments = "Enable this to allow chickens to lay eggs.")
    public boolean enableChickenEggLaying = true;

    @ConfigInfo(name = "chicken-egg-lay-check-interval", comments = "The interval in ticks for how often the server checks if a chicken can lay an egg. Set to 0 to check every tick. Higher values are better for performance.")
    public int chickenEggLayCheckInterval = 3600; // 3 minutes

    @Override
    public EnumConfigCategory getCategory() {
        return EnumConfigCategory.OPTIMIZATIONS;
    }

    @Override
    public String getBaseName() {
        return "entity";
    }
}