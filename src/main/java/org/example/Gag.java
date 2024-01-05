package org.example;

public class Gag extends Accessory{
    private final Material material;
    private final float effectiveness;
    public Gag(String name, String description, Material material, float effectiveness){
        super(name, description);
        this.material = material;
        this.effectiveness = effectiveness;
    }
    public final Material getMaterial(){
        return material;
    }
    public final float getEffectiveness(){
        return effectiveness;
    }
    @Override
    public int hashCode() {
        return super.hashCode() + this.getMaterial().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Кляп, " + this.getName();
    }

}
