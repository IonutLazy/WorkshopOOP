package com.company.polymorphism.override;

/**
 * Created by lazaric on 22.04.2019.
 */
public class Bird extends Animal {
    @Override
    public void startMoving() {
        System.out.println("Start flapping wings");
    }
}
