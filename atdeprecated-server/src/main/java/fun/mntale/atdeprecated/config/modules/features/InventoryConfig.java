package fun.mntale.atdeprecated.config.modules.features;

import fun.mntale.atdeprecated.config.EnumConfigCategory;
import fun.mntale.atdeprecated.config.IConfigModule;
import fun.mntale.atdeprecated.config.annotations.ConfigInfo;

public class InventoryConfig implements IConfigModule {

    @ConfigInfo(name = "barrel-rows", comments = "Number of rows for barrels. Valid values: 1-6.")
    public int barrelRows = 6;

    @ConfigInfo(name = "enderchest-rows", comments = "Number of rows for ender chests. Valid values: 1-6.")
    public int enderChestRows = 6;

    @ConfigInfo(name = "death-loot-glow", comments = "Make items dropped on death glow.")
    public boolean deathItemsGlow = true;

    @ConfigInfo(name = "death-loot-invulnerable", comments = "Make items dropped on death invulnerable.")
    public boolean deathItemsInvulnerable = true;

    @ConfigInfo(name = "death-loot-despawn-ticks", comments = "The time in ticks before items dropped on death despawn. Set to -1 to disable despawning. (20 ticks = 1 second)")
    public int deathItemDespawnTimeTicks = 1728000;

    @ConfigInfo(name = "death-loot-owner-pickup-only", comments = "Only the owner can pick up items dropped on death.")
    public boolean deathItemsOwnerPickupOnly = true;

    @ConfigInfo(name = "death-loot-hopper-cant-pickup", comments = "Prevent hoppers from picking up items dropped on death.")
    public boolean deathItemsHopperCantPickup = true;

    @ConfigInfo(name = "death-loot-mob-cant-pickup", comments = "Prevent mobs from picking up items dropped on death.")
    public boolean deathItemsMobCantPickup = true;

    @ConfigInfo(name = "death-loot-xp-drop-percentage", comments = "The percentage of XP to drop on death. Valid values: 0-100.")
    public int deathXpDropPercentage = 70;

    @ConfigInfo(name = "spread", comments = "The spread of items when a player dies.")
    public double deathLootSpread = 0.5D;

    @Override
    public EnumConfigCategory getCategory() {
        return EnumConfigCategory.FEATURES;
    }

    @Override
    public String getBaseName() {
        return "inventory";
    }
}