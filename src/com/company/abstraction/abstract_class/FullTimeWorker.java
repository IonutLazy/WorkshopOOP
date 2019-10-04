package com.company.abstraction.abstract_class;

/**
 * Created by lazaric on 22.04.2019.
 *
 * This class extends and implements the abstract method in it's parent class. Without implementing the required method, we would receive an error and the project would not compile.
 *
 * Keywords: extends and @Override
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
