package patikastore.enums;

public enum Brands {SAMSUNG(1,"Samsung"), LENOVO(2,"Lenovo"), APPLE(3,"Apple"),
                    HUAWEI(4,"Huawei"), CASPER(5,"Casper"), ASUS(6,"Asus"),
                    HP(7,"HP"), XIAOMI(8,"Xiaomi"), MONSTER(9,"Monster");
    int id;
    String name;
    Brands(int id, String name){
        this.id = id;
        this.name = name;
    }
    public String getBrand() {
        return this.name();
    }
    @Override
    public String toString() {
        return name;
    }
}
