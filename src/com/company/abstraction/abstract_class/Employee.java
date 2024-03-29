package com.company.abstraction.abstract_class;

/**
 * Created by lazaric on 22.04.2019.
 *
 * This is an abstract class. It can have both abstract and non-abstract methods. It needs to be extended and it's abstract method implemented. It cannot be instantiated.
 */
public abstract class Employee {
    private String name;
    private int paymentPerHour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public abstract int calculatePayment();
}
