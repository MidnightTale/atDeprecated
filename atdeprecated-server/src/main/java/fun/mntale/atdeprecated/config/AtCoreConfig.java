package fun.mntale.atdeprecated.config;

import fun.mntale.atdeprecated.config.modules.features.BeaconConfig;
import fun.mntale.atdeprecated.config.modules.removed.RemovedConfig;
import java.io.File;

public class AtCoreConfig {
    private static final ConfigManager configManager = new ConfigManager(new File("atdeprecated/atdeprecated-global.toml"));

    public static final BeaconConfig BEACON_CONFIG = new BeaconConfig();
    public static final RemovedConfig REMOVED_CONFIG = new RemovedConfig();

    public static void init() {
        registerModules();
        configManager.preload();
    }

    public static void load() {
        configManager.load();
    }

    private static void registerModules() {
        configManager.registerModule(BEACON_CONFIG);
        configManager.registerModule(REMOVED_CONFIG);
    }
}