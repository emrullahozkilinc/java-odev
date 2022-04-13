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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Adress> getAdresses() {
        return adresses;
    }

    public void setAdresses(ArrayList<Adress> adresses) {
        this.adresses = adresses;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }
}
