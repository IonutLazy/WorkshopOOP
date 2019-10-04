package com.company.Abstraction.AbstractClass;

/**
 * Created by lazaric on 22.04.2019.
 */
public class FullTimeWorker extends Employee {

    public FullTimeWorker(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * 8;
    }
}
