package com.company.polymorphism.overload;

/**
 * Created by lazaric on 22.04.2019.
 *
 * This class exemplifies method overloading. Two methods can have the same name as long as the arguments they expect are different or in a different order.
 * This is also known as Static Polymorphism
 */
public class Overloading {

    public static void singASong(String songName) {
        System.out.println("Started singing " + songName);
    }

    public static void singASong(String songName, int numberOfTimes) {
        System.out.println("Started singing " + songName + numberOfTimes + " number of times");
    }
}
