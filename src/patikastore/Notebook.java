package patikastore;

import patikastore.enums.Ram;
import patikastore.enums.Storage;

public class Notebook extends Product{
    public Notebook(String name, Brand brand, double price, double discount, int amount, Ram ram, Storage storage, double screenSize) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.discount = discount;
        this.amount = amount;
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }
}
