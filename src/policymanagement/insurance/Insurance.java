package policymanagement.insurance;

import java.util.Date;

public abstract class Insurance {
    private String name;
    double price;
    Date startDate;
    Date endDate;

    abstract double calculate();
}
