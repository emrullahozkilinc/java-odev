package policymanagement;

import policymanagement.enums.AuthenticationStatus;
import policymanagement.insurance.Insurance;
import policymanagement.user.User;

import java.util.ArrayList;

public abstract class Account {
    User user;
    ArrayList<Insurance> insurances;
    AuthenticationStatus authStatus;

    final void showUserInfo(){
        System.out.println(user.toString());
    }
}
