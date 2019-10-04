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
	// write your code here

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
    }
}
