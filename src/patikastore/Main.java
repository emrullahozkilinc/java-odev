package patikastore;

import patikastore.enums.Brands;
import patikastore.enums.Ram;
import patikastore.enums.Storage;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StoreNode notebooks = new StoreNode();
        StoreNode phones = new StoreNode();

        while (true){
            System.out.print("PatikaStore Ürün Yönetim Paneli !\n" +
                    "1 - Notebook İşlemleri\n" +
                    "2 - Cep Telefonu İşlemleri\n" +
                    "3 - Marka Listele\n" +
                    "0 - Çıkış Yap\n" +
                    "Tercihiniz :");
            short choose = getInput(0, 3);
            switch (choose){
                case 1:
                    notebookMenu(notebooks);
            }
            System.out.println(notebooks.toString());
        }
    }

    static void notebookMenu(StoreNode store){

        System.out.print("1 - Notebook Ekle\n" +
                "2 - Notebook Sil\n" +
                "3 - Geri\n" +
                "0 - Çıkış Yap\n" +
                "Tercihiniz :");
        switch (getInput(0, 2)){
            case 1:
                addProduct(store);
                break;
            case 2:
                System.out.print("Silinecek Notebook'ın ID'sini giriniz : ");
                store.removeProduct(scanner.nextInt());
                break;
            case 3:
                break;
            case 0:
                System.exit(0);
        }
    }

    public static short getInput(int min, int max){
        short choose = 0;
        do{
            try{
                choose = scanner.nextShort();
                if(choose < min || choose > max)
                    throw new InputMismatchException();
            }catch(InputMismatchException e){
                System.out.println("Invalid input, try again");
            }
        }while(choose < min || choose > max);

        return choose;
    }

    static void addProduct(StoreNode store){
        System.out.print("İsim : ");
        String name = scanner.nextLine();
        System.out.print("Marka : ");
        Arrays.asList(Brands.values()).forEach(x->System.out.print((x.ordinal()+1)+"-)"+x.toString()+" "));
        System.out.println();
        Brands brand = Brands.values()[getInput(1, Brands.values().length)-1];
        System.out.print("Fiyat : ");
        double price = scanner.nextDouble();
        System.out.print("Indirim Orani : ");
        double discount = scanner.nextDouble();
        System.out.print("Miktar : ");
        int amount = scanner.nextInt();
        System.out.print("Ram : ");
        Arrays.asList(Ram.values()).forEach(x->System.out.print((x.ordinal()+1)+"-)"+x.getRam()+" "));
        System.out.println();
        Ram ram = Ram.values()[getInput(1, Ram.values().length)-1];
        System.out.print("Kapasite : ");
        Arrays.asList(Storage.values()).forEach(x->System.out.print((x.ordinal()+1)+"-)"+x.getStorage()+" "));
        System.out.println();
        Storage storage = Storage.values()[getInput(1, Storage.values().length)-1];
        System.out.print("Ekran Boyutu : ");
        double screenSize = scanner.nextDouble();
        store.addProduct(new Notebook(name, brand, price, discount, amount, ram, storage, screenSize));
    }
}
