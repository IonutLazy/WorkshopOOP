package com.company;

import com.company.abstraction.abstract_class.Contractor;
import com.company.abstraction.abstract_class.Employee;
import com.company.abstraction.abstract_class.FullTimeWorker;
import com.company.abstraction.interfaces.Bicycle;
import com.company.abstraction.interfaces.Car;
import com.company.abstraction.interfaces.Vehicle;
import com.company.encapsulation.Person;
import com.company.inheritance.ChildClass;
import com.company.inheritance.GrandChild;
import com.company.polymorphism.overload.Overloading;
import com.company.polymorphism.override.Animal;
import com.company.polymorphism.override.Bird;

public class Main {

    public static void main(String[] args) {

        //encapsulation
        Person person = new Person();
        person.setAge(15);
        person.setHeight(155);
        person.setName("Vasile");
        person.setSex("Male");

        System.out.println(person.getName() + " is a " + person.getAge() + " year old " + person.getSex() + " with a height of " + person.getHeight());

        //inheritance
        ChildClass child = new ChildClass();
        child.doSomething();

        GrandChild grandChild = new GrandChild();
        grandChild.doSomething();

        //polymorphism
        //override

        Animal animal = new Animal();
        animal.startMoving();

        Bird bird = new Bird();
        bird.startMoving();
        bird.stop();

        //Overloading
        Overloading.singASong("Stairway to heaven");
        Overloading.singASong("Highway to hell", 2);


        //abstraction
        System.out.println("Print the daily salary of a full time worker");
        Employee fulltimeWorker = new FullTimeWorker("Jimmy", 10);
        System.out.println(fulltimeWorker.calculateSalary());

        System.out.println("Print the daily salary of a contractor");
        Employee contractor = new Contractor("Alice", 5, 5);
        System.out.println(contractor.calculateSalary());

        Vehicle bicycle = new Bicycle();
        bicycle.startVehicle();

        Vehicle car = new Car();
        car.startVehicle();



        // write your code here and in the exercise package
        //1. create a Phone abstract class.
        // Extend it with 5 different real-life phones.
        // They should have the following attributes: Manufacturer, Model, Screen Size, Battery Size and Price
        // They should have the following methods: call, take a picture, set alarm, listen to music

        //2. create a Car interface.
        // It should have the following methods: unlock car, start car, shift gear, lock car
        // Implement this interface for the following types of cars: that have both regular unlocking as well as keyless unlocking, regular keys or keyless go, manual and automatic transmission

        //3. Create a Parent class containing a method and a Child class that extends it.
        // Override that methods and Overload it with multiple implementations
    }
}
