package fun.mntale.atdeprecated.config;

import fun.mntale.atdeprecated.config.modules.features.GriefPreventionConfig;
import fun.mntale.atdeprecated.config.modules.features.*;
import fun.mntale.atdeprecated.config.modules.fixes.*;
import fun.mntale.atdeprecated.config.modules.experiment.*;
import fun.mntale.atdeprecated.config.modules.optimizations.EntityConfig;
import fun.mntale.atdeprecated.config.modules.removed.RemovedConfig;
import java.io.File;

public class AtCoreConfig {
    private static final ConfigManager configManager = new ConfigManager(new File("atdeprecated/atdeprecated-global.toml"));

    public static final AnvilConfig ANVIL_CONFIG = new AnvilConfig();
    public static final BeaconConfig BEACON_CONFIG = new BeaconConfig();
    public static final DispenserConfig DISPENSER_CONFIG = new DispenserConfig();
    public static final ElytraConfig ELYTRA_CONFIG = new ElytraConfig();
    public static final PlayerConfig PLAYER_CONFIG = new PlayerConfig();
    public static final InventoryConfig INVENTORY_CONFIG = new InventoryConfig();
    public static final WaypointConfig WAYPOINT_CONFIG = new WaypointConfig();
    public static final GriefPreventionConfig GRIEF_PREVENTION_CONFIG = new GriefPreventionConfig();
    public static final RemovedConfig REMOVED_CONFIG = new RemovedConfig();
    public static final EntityConfig ENTITY_CONFIG = new EntityConfig();
    public static final RayTrackingEntityTrackerConfig RAY_TRACKING_ENTITY_TRACKER_CONFIG = new RayTrackingEntityTrackerConfig();

    public static void init() {
        registerModules();
        configManager.preload();
    }

    public static void load() {
        configManager.load();
    }

    private static void registerModules() {
        configManager.registerModule(ANVIL_CONFIG);
        configManager.registerModule(BEACON_CONFIG);
        configManager.registerModule(DISPENSER_CONFIG);
        configManager.registerModule(ELYTRA_CONFIG);
        configManager.registerModule(PLAYER_CONFIG);
        configManager.registerModule(INVENTORY_CONFIG);
        configManager.registerModule(WAYPOINT_CONFIG);
        configManager.registerModule(GRIEF_PREVENTION_CONFIG);
        configManager.registerModule(REMOVED_CONFIG);
        configManager.registerModule(ENTITY_CONFIG);
        configManager.registerModule(RAY_TRACKING_ENTITY_TRACKER_CONFIG);
    }
}