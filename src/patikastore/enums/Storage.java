package patikastore.enums;

public enum Storage {
    SMALL("64 GB"), MEDIUM("128 GB"), LARGE("256 GB"), XLARGE("512 GB"), XXLARGE("1 TB");
    private String storage;
    private Storage(String storage) {
        this.storage = storage;
    }
    public String getStorage() {
        return storage;
    }
}
