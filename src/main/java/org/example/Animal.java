package org.example;

import java.util.ArrayList;

public abstract class Animal {
    private String name;
    private int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public final String getName(){
        return name;
    }
    public final int getAge(){
        return age;
    }
}
