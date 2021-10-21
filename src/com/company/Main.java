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
        Person person = new Person("romanian", 174, "bus driver", 27);

        System.out.println("This " + person.getOccupation() + " is a " + person.getAge() + " year old " + person.getNationality());

        //inheritance
        ChildClass child = new ChildClass();
        child.parentMethod();

        GrandChild grandChild = new GrandChild();
        grandChild.parentMethod();


        //polymorphism
        //override

        Animal animal = new Animal();
        animal.move();

        Bird bird = new Bird();
        bird.move();
        bird.stop();

        //Overloading
        Overloading.singASong("Stairway to heaven");
        Overloading.singASong("Highway to hell", 2);


        //abstraction
        System.out.println("Print the daily salary of a full time worker");
        Employee fulltimeWorker = new FullTimeWorker("John", 10);
        System.out.println(fulltimeWorker.calculatePayment());

        System.out.println("Print the daily salary of a contractor");
        Employee contractor = new Contractor("Aloy", 5, 5);
        System.out.println(contractor.calculatePayment());


        Vehicle bicycle = new Bicycle();
        bicycle.signalTurn("left");

        Vehicle car = new Car();
        car.signalTurn("right");
    }
}
