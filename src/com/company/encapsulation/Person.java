package com.company.encapsulation;

/**
 * Created by lazaric on 22.04.2019.
 *
 * Encapsulation binds data and its related methods together within a class.
 * It also protects the data by making fields private and giving access to them only through their related methods.
 */
public class Person {
    private int age;
    private int height;
    private String name;
    private String sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
