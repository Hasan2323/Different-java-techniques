public enum TestEnum {
    MONTHLY("M", "Monthly"),
    YEARLY("Y", "Yearly"),
    WEEKLY("W", "Weekly");

    private final String description;
    private final String value;

    TestEnum(String description, String value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }
    public String getValue() {
        return value;
    }
}
