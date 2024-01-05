package org.example;

import java.util.ArrayList;

public abstract class Human implements IntSayer, IntWearer {
    private String name;
    private int age;
    private Status status;
    ArrayList<Accessory> accessories;
    public Human(String name, int age){
        this.name = name;
        this.age = age;
        accessories = new ArrayList<Accessory>();
        status = Status.Normal;
    }
    public final String getName(){
        return name;
    }
    public final int getAge(){
        return age;
    }
    public void say(String text){
        System.out.println(name + " сказал: " + text);
    }
    public void setStatus(Status status){
        this.status = status;
    }
    public void putOn(Accessory accessory){
        accessories.add(accessory);
    }
    public void takeOff(Accessory accessory){
        accessories.remove(accessory);
    }
    public ArrayList<Accessory> getAccessories(){
        return accessories;
    }
    @Override
    public int hashCode() {
        return super.hashCode()+this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return this.getName() + ", " + this.getAge();
    }


}
