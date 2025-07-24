package fun.mntale.atdeprecated.commands;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ToggleInsomniaCommand extends Command {

    public ToggleInsomniaCommand(String name) {
        super(name);
        this.setDescription("Toggles phantom spawning for the player.");
        this.setUsage("/" + name);
        this.setPermission("atdeprecated.command.toggleinsomnia");
    }

    @Override
    public boolean execute(@NotNull CommandSender sender, @NotNull String commandLabel, @NotNull String[] args) {
        if (!testPermission(sender)) {
            return true;
        }

        if (!(sender instanceof Player player)) {
            sender.sendMessage(Component.text("Only players can use this command.").color(NamedTextColor.RED));
            return true;
        }

        net.minecraft.world.entity.player.Player nmsPlayer = ((org.bukkit.craftbukkit.entity.CraftPlayer) player).getHandle();
        boolean current = nmsPlayer.isInsomniaEnabled();
        nmsPlayer.setInsomniaEnabled(!current);

        player.sendActionBar(
            Component.text("Insomnia: ")
                .append(Component.text(!current ? "Enabled" : "Disabled")
                    .color(!current ? NamedTextColor.GREEN : NamedTextColor.RED))
        );

        return true;
    }
}