package fun.mntale.atdeprecated.config.modules.features;

import fun.mntale.atdeprecated.config.EnumConfigCategory;
import fun.mntale.atdeprecated.config.IConfigModule;
import fun.mntale.atdeprecated.config.annotations.ConfigInfo;

public class PlayerConfig implements IConfigModule {

    @ConfigInfo(name = "per-player-insomnia", comments = "Enable per-player insomnia settings. If false, the server will use the global phantom spawning rules.")
    public boolean perPlayerInsomnia = true;

    @ConfigInfo(name = "enable-toggle-insomnia-command", comments = "Enable the /toggleinsomnia command for players to control phantom spawning. Requires per-player-insomnia to be true.")
    public boolean enableToggleInsomniaCommand = true;

    @ConfigInfo(name = "default-insomnia-state", comments = "The default state of insomnia for players when they first join. Requires per-player-insomnia to be true.")
    public boolean defaultInsomniaState = true;

    @Override
    public EnumConfigCategory getCategory() {
        return EnumConfigCategory.FEATURES;
    }

    @Override
    public String getBaseName() {
        return "player";
    }
}