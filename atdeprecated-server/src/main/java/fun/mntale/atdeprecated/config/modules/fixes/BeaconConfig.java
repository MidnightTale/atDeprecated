package fun.mntale.atdeprecated.config.modules.fixes;

import fun.mntale.atdeprecated.config.EnumConfigCategory;
import fun.mntale.atdeprecated.config.IConfigModule;
import fun.mntale.atdeprecated.config.annotations.ConfigInfo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BeaconConfig implements IConfigModule {

    @ConfigInfo(name = "ranges", comments = "Beacon ranges for levels 1-4, separated by commas")
    public String ranges = "24,32,64,128";

    private List<Integer> parsedRanges;

    public List<Integer> getParsedRanges() {
        if (parsedRanges == null) {
            parsedRanges = Arrays.stream(ranges.split(","))
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .limit(4)
                    .collect(Collectors.toList());
        }
        return parsedRanges;
    }

    @Override
    public EnumConfigCategory getCategory() {
        return EnumConfigCategory.FIXES;
    }

    @Override
    public String getBaseName() {
        return "beacon";
    }
}