package policymanagement.user;

import policymanagement.adress.Adress;

import java.util.ArrayList;
import java.util.Date;

public class User {
    String name;
    String lastName;
    String email;
    String password;
    String job;
    int age;
    ArrayList<Adress> adresses;
    Date lastLogin;

    public void addAdress(Adress adress){
        if (adresses == null)
            adresses = new ArrayList<>();
        adresses.add(adress);
    }

    public void removeAdress(Adress adress){
        if(adresses != null)
            adresses.remove(adress);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                ", adresses=" + adresses +
                ", lastLogin=" + lastLogin +
                '}';
    }
}
