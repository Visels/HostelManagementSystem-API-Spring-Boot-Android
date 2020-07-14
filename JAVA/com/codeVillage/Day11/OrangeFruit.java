package com.codeVillage.Day11;

public class OrangeFruit extends Fruit {

    private boolean hasSeeds;


    public OrangeFruit(String name, String color, boolean isPerishable, int weight, boolean hasSeeds){

        super(name,weight,isPerishable, color);
        this.hasSeeds = hasSeeds;
    }

    public void setHasSeeds(boolean hasSeeds) {
        this.hasSeeds = hasSeeds;
    }
    public boolean getHasSeeds(){
        return hasSeeds;
    }
}
