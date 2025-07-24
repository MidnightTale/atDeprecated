package fun.mntale.atdeprecated.config.modules.features;

import fun.mntale.atdeprecated.config.EnumConfigCategory;
import fun.mntale.atdeprecated.config.IConfigModule;
import fun.mntale.atdeprecated.config.annotations.ConfigInfo;

public class DeathLootConfig implements IConfigModule {

    @ConfigInfo(name = "glow", comments = "Make items dropped on death glow.")
    public boolean deathItemsGlow = true;

    @ConfigInfo(name = "invulnerable", comments = "Make items dropped on death invulnerable.")
    public boolean deathItemsInvulnerable = true;

    @ConfigInfo(name = "despawn-time-ticks", comments = "The time in ticks before items dropped on death despawn. Set to -1 to disable despawning. (20 ticks = 1 second)")
    public int deathItemDespawnTimeTicks = 1728000;

    @ConfigInfo(name = "owner-pickup-only", comments = "Only the owner can pick up items dropped on death.")
    public boolean deathItemsOwnerPickupOnly = true;

    @ConfigInfo(name = "hopper-cant-pickup", comments = "Prevent hoppers from picking up items dropped on death.")
    public boolean deathItemsHopperCantPickup = true;

    @ConfigInfo(name = "mob-cant-pickup", comments = "Prevent mobs from picking up items dropped on death.")
    public boolean deathItemsMobCantPickup = true;

    @ConfigInfo(name = "xp-drop-percentage", comments = "The percentage of XP to drop on death. Valid values: 0-100.")
    public int deathXpDropPercentage = 70;

    @ConfigInfo(name = "spread", comments = "The spread of items when a player dies.")
    public double deathLootSpread = 0.5D;

    @Override
    public EnumConfigCategory getCategory() {
        return EnumConfigCategory.FEATURES;
    }

    @Override
    public String getBaseName() {
        return "death-loot";
    }
}