package fun.mntale.atdeprecated.config;

import fun.mntale.atdeprecated.config.modules.features.AnvilConfig;
import fun.mntale.atdeprecated.config.modules.features.BeaconConfig;
import fun.mntale.atdeprecated.config.modules.experiment.WaypointConfig;
import fun.mntale.atdeprecated.config.modules.features.DispenserConfig;
import fun.mntale.atdeprecated.config.modules.features.ElytraConfig;
import fun.mntale.atdeprecated.config.modules.features.PlayerConfig;
import fun.mntale.atdeprecated.config.modules.removed.RemovedConfig;
import java.io.File;

public class AtCoreConfig {
    private static final ConfigManager configManager = new ConfigManager(new File("atdeprecated/atdeprecated-global.toml"));

    public static final AnvilConfig ANVIL_CONFIG = new AnvilConfig();
    public static final BeaconConfig BEACON_CONFIG = new BeaconConfig();
    public static final DispenserConfig DISPENSER_CONFIG = new DispenserConfig();
    public static final ElytraConfig ELYTRA_CONFIG = new ElytraConfig();
    public static final PlayerConfig PLAYER_CONFIG = new PlayerConfig();
    public static final WaypointConfig WAYPOINT_CONFIG = new WaypointConfig();
    public static final RemovedConfig REMOVED_CONFIG = new RemovedConfig();

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
        configManager.registerModule(WAYPOINT_CONFIG);
        configManager.registerModule(REMOVED_CONFIG);
    }
}