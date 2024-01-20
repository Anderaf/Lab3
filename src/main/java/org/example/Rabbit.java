package org.example;

import java.awt.*;

public class Rabbit extends Animal{
    private Color color;
    public Rabbit(String name, int age, Color color){
        super(name, age);
        this.color = color;
    }
    public Color getColor(){
        return color;
    }
    @Override
    public String toString() {
        return "Кролик " + this.getName();
    }
}
