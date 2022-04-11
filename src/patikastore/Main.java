package patikastore;

import patikastore.enums.*;

import java.lang.reflect.Field;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StoreNode notebooks = new StoreNode();
        StoreNode phones = new StoreNode();

        while (true){
            System.out.print("""
                    PatikaStore Ürün Yönetim Paneli !
                    1 - Notebook İşlemleri
                    2 - Cep Telefonu İşlemleri
                    3 - Marka Listele
                    0 - Çıkış Yap
                    Tercihiniz :""");
            short choose = getInput(0, 3);
            switch (choose) {
                case 1 -> notebookMenu(notebooks);
                case 2 -> phoneMenu(phones);
                case 3 -> {
                    TreeSet brs = new TreeSet(new BrandsComparator());
                    brs.addAll(Arrays.asList(Brands.values()));
                    System.out.println("Markalar : ");
                    brs.forEach(System.out::println);
                }
            }
            System.out.println(phones);
        }
    }

    static void notebookMenu(StoreNode store){
        System.out.print("""
                1 - Notebook Ekle
                2 - Notebook Sil
                3 - Notebook Listele
                4 - Geri
                0 - Çıkış Yap
                Tercihiniz :""");
        switch (getInput(0, 4)){
            case 1:
                addNotebook(store);
                break;
            case 2:
                System.out.print("Silinecek Notebook'ın ID'sini giriniz : ");
                store.removeProduct(scanner.nextInt());
                break;
            case 3:
                System.out.println( "1 - Tümünü Listele\n" +
                                    "2 - Id Belirterek Listele\n");
                switch (getInput(1, 2)) {
                    case 1 -> store.getProducts();
                    case 2 -> {
                        System.out.print("Listelenecek ID'sini giriniz : ");
                        store.getProduct(scanner.nextInt());
                    }
                }

            case 4:
                break;
            case 0:
                System.exit(0);
        }
    }

    static void phoneMenu(StoreNode store){
        System.out.print("""
                1 - Phone Ekle
                2 - Phone Sil
                3 - Phone Listele
                4 - Geri
                0 - Çıkış Yap
                Tercihiniz :""");
        switch (getInput(0, 4)){
            case 1:
                addPhone(store);
                break;
            case 2:
                System.out.print("Silinecek Notebook'ın ID'sini giriniz : ");
                store.removeProduct(scanner.nextInt());
                break;
            case 3:
                System.out.println("""
                        1 - Tümünü Listele
                        2 - Id Belirterek Listele
                        """);
                switch (getInput(1, 2)) {
                    case 1 -> store.getProducts();
                    case 2 -> {
                        System.out.print("Listelenecek ID'sini giriniz : ");
                        Phone phone = null;
                        try {
                            phone = (Phone) store.getProduct(scanner.nextInt());
                            printStore(Arrays.asList(phone));
                        }catch (ClassCastException | NullPointerException | IllegalAccessException e){
                            System.err.println(e.getMessage());
                            System.out.println("Bu ID'ye sahip bir ürün bulunamadı.");
                        }
                        break;
                    }
                }
            case 4:
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

    static void printStore(List<Product> products) throws IllegalAccessException {
        List<Field> l1 = new ArrayList<>();
        Collections.addAll(l1, products.get(0).getClass().getDeclaredFields());
        Collections.addAll(l1, products.get(0).getClass().getSuperclass().getDeclaredFields());

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        for(Field field : l1){
            System.out.printf("| %-10s ",field.getName().toUpperCase() + " ");
        }
        System.out.println("|");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        for(Product product : products){
            for(Field field : l1){
                System.out.printf("| %-10s ",field.get(product) + " ");
            }
        }
        System.out.println("|");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
    }


    static void addNotebook(StoreNode store){
        System.out.print("İsim : ");
        String name = scanner.next();
        System.out.print("Marka : ");
        Arrays.asList(Brands.values()).forEach(x->System.out.print((x.ordinal()+1)+"-)"+x+" "));
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

    static void addPhone(StoreNode store){
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
        System.out.print("Batarya Kapasitesi (mAh) : ");
        int batteryCapacity = scanner.nextInt();
        System.out.print("Renk : ");
        Arrays.asList(Color.values()).forEach(x->System.out.print((x.ordinal()+1)+"-)"+x.toString()+" "));
        System.out.println();
        Color color = Color.values()[getInput(1, Color.values().length)-1];
        store.addProduct(new Phone(name, brand, price, discount, amount, ram, storage, screenSize, batteryCapacity, color));
    }
}
