package org.example;

public class Hat extends Accessory {
    private final Material material;
    private final float size;
    public Hat(String name, String description, Material material, float size){
        super(name, description);
        this.material = material;
        this.size = size;
    }

    public final Material getMaterial() {
        return material;
    }
    public final float getSize(){
        return size;
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
