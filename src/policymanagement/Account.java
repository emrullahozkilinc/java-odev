package policymanagement;

import policymanagement.adress.Adress;
import policymanagement.enums.AuthenticationStatus;
import policymanagement.exception.InvalidAuthenticationException;
import policymanagement.insurance.Insurance;
import policymanagement.user.User;

import java.util.ArrayList;
import java.util.TreeSet;

public abstract class Account {
    TreeSet<User> users;
    ArrayList<Insurance> insurances;
    AuthenticationStatus authStatus;

    final void showUserInfo(){
        if (users!=null){
            users.forEach(System.out::println);
        }else {
            System.out.println("No users");
        }
    }

    final void login(String email, String password){
        authStatus = AuthenticationStatus.FAIL;
        try {
            for (User user : users) {
                if (users != null & (user.getEmail().equals(email) && user.getPassword().equals(password))) {
                    authStatus = AuthenticationStatus.SUCCESS;
                    System.out.println("Login success");
                    break;
                }
            }
            if (authStatus == AuthenticationStatus.FAIL)
                throw new InvalidAuthenticationException("Invalid email or password");
        }catch (InvalidAuthenticationException e){
            System.err.println(e.getMessage());
        }
    }

    final AuthenticationStatus getAuthStatus(){
        return authStatus;
    }

    protected abstract void addInsurance(Insurance insurance);

    final void deleteInsurance(Insurance insurance){
        if (insurances!=null || !insurances.isEmpty())
            insurances.remove(insurance);
    }

    void addAdress(User user,Adress adress){
        user.addAdress(adress);
    }

    void removeAdress(User user, Adress adress){
        user.removeAdress(adress);
    }
}
