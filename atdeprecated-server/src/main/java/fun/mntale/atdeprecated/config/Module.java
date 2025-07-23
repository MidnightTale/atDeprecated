package fun.mntale.atdeprecated.config;

import java.util.List;

public interface Module {
    String getName();

    List<Setting<?>> getSettings();
}