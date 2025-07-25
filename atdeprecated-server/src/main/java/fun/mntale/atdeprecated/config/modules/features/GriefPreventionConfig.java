package fun.mntale.atdeprecated.config.modules.features;

import fun.mntale.atdeprecated.config.EnumConfigCategory;
import fun.mntale.atdeprecated.config.IConfigModule;
import fun.mntale.atdeprecated.config.annotations.ConfigInfo;

public class GriefPreventionConfig implements IConfigModule {

    @ConfigInfo(name = "prevent-tnt-explode", comments = "Prevent TNT from destroying blocks")
    public boolean preventTntGrief = false;

    @ConfigInfo(name = "prevent-creeper-explode", comments = "Prevent Creepers from destroying blocks")
    public boolean preventCreeperGrief = true;

    @ConfigInfo(name = "prevent-tnt-minecart-explode", comments = "Prevent TNT Minecarts from destroying blocks")
    public boolean preventTntMinecartGrief = true;

    @ConfigInfo(name = "prevent-bed-explode", comments = "Prevent Beds from destroying blocks in the nether/end")
    public boolean preventBedGrief = true;

    @ConfigInfo(name = "prevent-respawn-anchor-explode", comments = "Prevent Respawn Anchors from destroying blocks")
    public boolean preventRespawnAnchorGrief = true;

    @ConfigInfo(name = "prevent-end-crystal-explode", comments = "Prevent End Crystals from destroying blocks")
    public boolean preventEndCrystalGrief = true;

    @ConfigInfo(name = "prevent-fireball-explode", comments = "Prevent fireballs (from ghasts, blazes, etc.) from destroying blocks")
    public boolean preventFireballGrief = true;

    @ConfigInfo(name = "prevent-enderman-take-block", comments = "Prevent Endermen from picking up blocks")
    public boolean preventEndermanGrief = true;

    @ConfigInfo(name = "prevent-wither-boss-explode", comments = "Prevent the main Wither boss explosion from destroying blocks")
    public boolean preventWitherBossExplode = true;

    @ConfigInfo(name = "prevent-wither-skull-explode", comments = "Prevent Wither skulls from destroying blocks")
    public boolean preventWitherSkullExplode = true;

    @ConfigInfo(name = "prevent-wither-boss-destroy-block", comments = "Prevent the Wither from breaking blocks by charging")
    public boolean preventWitherBossDestroyBlock = false;

    @Override
    public EnumConfigCategory getCategory() {
        return EnumConfigCategory.FEATURES;
    }

    @Override
    public String getBaseName() {
        return "grief-prevention";
    }
}