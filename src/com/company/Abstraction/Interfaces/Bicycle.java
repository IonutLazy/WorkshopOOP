package com.company.Abstraction.Interfaces;

/**
 * Created by lazaric on 22.04.2019.
 */
public class Bicycle implements Vehicle {
    @Override
    public void startVehicle() {
        System.out.println("Start pedalling");
    }
}
