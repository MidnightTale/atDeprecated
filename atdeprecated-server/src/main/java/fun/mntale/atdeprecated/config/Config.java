package fun.mntale.atdeprecated.config;

import java.io.File;

public class Config {
    private static final Manager configManager = new Manager(new File("atdeprecated_config.toml"));

    public static void init() {
        registerModules();
        configManager.preload();
    }

    public static void load() {
        configManager.load();
    }

    private static void registerModules() {
        configManager.registerModule(Global.REMOVED_CONFIG);
    }
}