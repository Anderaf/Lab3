package org.example;

public class Child extends Human{
    public Child(String name, int age){
        super(name, age);
        if (age > 17){
            throw new WrongAgeException("Возраст ребёнка должен быть меньше 18");
        }
    }
    @Override
    public String toString() {
        return "Ребёнок " + this.getName();
    }
}
