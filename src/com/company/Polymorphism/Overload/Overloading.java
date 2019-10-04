package com.company.Polymorphism.Overload;

/**
 * Created by lazaric on 22.04.2019.
 */
public class Overloading {

    public static void singASong(String songName) {
        System.out.println("Started singing " + songName);
    }

    public static void singASong(String songName, int numberOfTimes) {
        System.out.println("Started singing " + songName + numberOfTimes + " number of times");
    }
}
