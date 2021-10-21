package com.company.abstraction.interfaces;

/**
 * Created by lazaric on 22.04.2019.
 *
 * This class implements the Vehicle interface.
 *
 * Keywords: implements and @Override
 */
public class Bicycle implements Vehicle {
    @Override
    public void signalTurn(String direction) {
        System.out.println("raise " + direction + " arm");
    }
}
