package fun.mntale.atdeprecated.config;

public class Setting<T> {
    private final String key;
    private final T defaultValue;
    private final String comment;
    private T value;

    public Setting(String key, T defaultValue, String comment) {
        this.key = key;
        this.defaultValue = defaultValue;
        this.comment = comment;
        this.value = defaultValue;
    }

    public String getKey() {
        return key;
    }

    public T getDefaultValue() {
        return defaultValue;
    }

    public String getComment() {
        return comment;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}