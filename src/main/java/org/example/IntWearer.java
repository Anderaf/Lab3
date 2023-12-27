package org.example;

import java.util.ArrayList;

public interface IntWearer {
    public void putOn(Accessory accessory);
    public void takeOff(Accessory accessory);
    public ArrayList<Accessory> getAccessories();
}
