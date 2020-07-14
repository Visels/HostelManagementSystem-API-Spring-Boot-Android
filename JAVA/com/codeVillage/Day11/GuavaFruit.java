package com.codeVillage.Day11;

public class GuavaFruit extends Fruit {

    private String howRipe = "";


    public GuavaFruit(String name, String color, boolean isPerishable, int weight, String howRipe){

        super(name,weight,isPerishable, color);
        this.howRipe = howRipe;
    }

    public String getHowRipe() {
        return howRipe;
    }

    public void setHowRipe(String howRipe) {
        this.howRipe = howRipe;
    }
}
