package fun.mntale.atdeprecated.config;

public enum EnumConfigCategory {
    FIXES("fixes"),
    OPTIMIZATIONS("optimizations"),
    MISC("misc"),
    FEATURES("features"),
    EXPERIMENT("experiment"),
    REMOVED("removed");

    private final String key;

    EnumConfigCategory(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}