package patikastore;

import patikastore.enums.Brands;
import patikastore.enums.Ram;
import patikastore.enums.Storage;

public class Notebook extends Product{
    public Notebook(String name, Brands brands, double price, double discount, int amount, Ram ram, Storage storage, double screenSize) {
        this.name = name;
        this.brands = brands;
        this.price = price;
        this.discount = discount;
        this.amount = amount;
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "id='" + id +
                ", name='" + name + '\'' +
                ", brand=" + brands +
                ", price=" + price +
                ", discount=" + discount +
                ", amount=" + amount +
                ", ram=" + ram +
                ", storage=" + storage +
                ", screenSize=" + screenSize +
                '}';
    }
}
