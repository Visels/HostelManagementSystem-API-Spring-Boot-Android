//BASE CLASS
package com.codeVillage.Day11;

public class Fruit {
    private String name = "";
    private int weight = 0;
    private boolean isPerishable;
    private String color = "";

    public Fruit(String name, int weight, boolean isPerishable, String color){

        this.name = name;
        this.weight = weight;
        this.color = color;
        this.isPerishable = isPerishable;

    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean getisPerishable(){
        return isPerishable;

    }


}
