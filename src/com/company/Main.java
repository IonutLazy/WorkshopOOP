package com.company;

import com.company.Abstraction.AbstractClass.Contractor;
import com.company.Abstraction.AbstractClass.Employee;
import com.company.Abstraction.AbstractClass.FullTimeWorker;
import com.company.Abstraction.Interfaces.Bicycle;
import com.company.Abstraction.Interfaces.Car;
import com.company.Abstraction.Interfaces.Vehicle;
import com.company.Encapsulation.Person;
import com.company.Inheritance.ChildClass;
import com.company.Inheritance.GrandChild;
import com.company.Polymorphism.Overload.Overloading;
import com.company.Polymorphism.Override.Animal;
import com.company.Polymorphism.Override.Bird;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Encapsulation
        Person person = new Person();
        person.setAge(15);
        person.setHeight(155);
        person.setName("Vasile");
        person.setSex("Male");

        System.out.println(person.getName() + " is a " + person.getAge() + " year old " + person.getSex() + " with a height of " + person.getHeight());

        //Inheritance
        ChildClass child = new ChildClass();
        child.doSomething();

        GrandChild grandChild = new GrandChild();
        grandChild.doSomething();


        //Polymorphism
        //Override

        Animal animal = new Animal();
        animal.startMoving();

        Bird bird = new Bird();
        bird.startMoving();
        bird.stop();

        //Overloading
        Overloading.singASong("Stairway to heaven");
        Overloading.singASong("Highway to hell", 2);


        //Abstraction
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
    }
}
