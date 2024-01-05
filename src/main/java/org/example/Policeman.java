package org.example;

public class Policeman extends Human {
    private final String policeId;
    public Policeman(String name, int age, String policeId){
        super(name, age);
        this.policeId = policeId;
    }
    public final String getPoliceId(){
        return policeId;
    }
    @Override
    public int hashCode() {
        return super.hashCode() + this.getPoliceId().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return this.getName() + ", " + this.getAge() + ", Полицейский идентификатор: " + this.getPoliceId();
    }
}
