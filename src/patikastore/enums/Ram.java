package patikastore.enums;

public enum Ram {
    XXSMALL("1 GB"), XSMALL("2 GB"), SMALL("4 GB"), SMEDIUM("6 GB"),MEDIUM("8 GB"),XMEDIUM("12 GB"), LARGE("16 GB"), XLARGE("32 GB"), XXLARGE("64 GB"), XXXLARGE("128 GB");
    private String ram;
    private Ram(String ram) {
        this.ram = ram;
    }
}
