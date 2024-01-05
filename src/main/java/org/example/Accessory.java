package org.example;

public abstract class Accessory {
    private final String name;
    private final String description;
    public Accessory(String name, String description){
        this.name = name;
        this.description = description;
    }
    public final String getName(){
        return name;
    }
    public final String getDescription(){
        return description;
    }
    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Аксессуар, " + this.getName();
    }
}
