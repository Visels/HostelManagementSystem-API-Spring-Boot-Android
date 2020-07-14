package com.codeVillage.Day11;

public class MangoFruit extends Fruit {

   private String mangoType = "";


   public MangoFruit(String name, String color, boolean isPerishable, int weight,String mangoType){

       super(name,weight,isPerishable, color);
       this.mangoType = mangoType;

   }

    public String getMangoType() {
        return mangoType;
    }

    public void setMangoType(String mangoType) {
        this.mangoType = mangoType;
    }
}
