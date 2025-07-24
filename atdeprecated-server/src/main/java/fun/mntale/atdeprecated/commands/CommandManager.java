package fun.mntale.atdeprecated.commands;

import fun.mntale.atdeprecated.config.AtCoreConfig;
import org.bukkit.Bukkit;

public class CommandManager {

    public static void init() {
        if (AtCoreConfig.PLAYER_CONFIG.perPlayerInsomnia && AtCoreConfig.PLAYER_CONFIG.enableToggleInsomniaCommand) {
            Bukkit.getCommandMap().register("toggleinsomnia", "atdeprecated", new ToggleInsomniaCommand("toggleinsomnia"));
        }
    }
}