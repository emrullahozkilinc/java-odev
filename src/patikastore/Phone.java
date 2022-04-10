package patikastore;

import patikastore.enums.Brands;
import patikastore.enums.Color;
import patikastore.enums.Ram;
import patikastore.enums.Storage;

public class Phone extends Product{
    int battery;
    Color color;

    public Phone(String name, Brands brands, double price, double discount, int amount, Ram ram, Storage storage, double screenSize, int battery, Color color) {
        this.name = name;
        this.brands = brands;
        this.price = price;
        this.discount = discount;
        this.amount = amount;
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
        this.battery = battery;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "battery=" + battery +
                ", color=" + color +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", brands=" + brands +
                ", price=" + price +
                ", discount=" + discount +
                ", amount=" + amount +
                ", ram=" + ram +
                ", storage=" + storage +
                ", screenSize=" + screenSize +
                '}';
    }
}
