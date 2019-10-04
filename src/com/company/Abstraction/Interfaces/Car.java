package com.company.Abstraction.Interfaces;

/**
 * Created by lazaric on 22.04.2019.
 */
public class Car implements Vehicle {
    @Override
    public void startVehicle() {
        System.out.println(
                "Turn the key in the ignition"
        );
    }
}
