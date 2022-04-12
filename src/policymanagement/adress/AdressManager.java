package policymanagement.adress;

import policymanagement.user.User;

public class AdressManager {
    public static void addAdress(User user, Adress adress) {
        user.addAdress(adress);
    }

    public static void removeAdress(User user, Adress adress) {
        user.removeAdress(adress);
    }
}
