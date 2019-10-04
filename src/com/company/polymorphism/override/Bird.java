package com.company.polymorphism.override;

/**
 * Created by lazaric on 22.04.2019.
 *
 * This class exemplifies Method Overriding. By overriding a method, the child class implements it's own version of a method inherited from the parent class.
 * This is also known as Dynamic Polymorphism
 */
public class Bird extends Animal {
    @Override
    public void startMoving() {
        System.out.println("Start flapping wings");
    }
}
