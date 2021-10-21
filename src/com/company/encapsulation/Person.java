package com.company.encapsulation;

/**
 * Created by lazaric on 22.04.2019.
 *
 * Encapsulation binds data and its related methods together within a class.
 * It also protects the data by making fields private and giving access to them only through their related methods.
 */
public class Person {
    private String nationality;
    private int height;
    private String occupation;
    private int age;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String nationality, int height, String occupation, int age) {
        this.nationality = nationality;
        this.height = height;
        this.occupation = occupation;
        this.age = age;
    }
}
