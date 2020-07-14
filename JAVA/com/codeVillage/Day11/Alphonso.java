package com.codeVillage.Day11;

public class Alphonso  extends MangoFruit{

    private boolean isRipe ;

    public Alphonso(String name, String color , int weight, boolean isPerishable, String mangotype, boolean isRipe){

        super(name, color, isPerishable, weight, mangotype);
        this.isRipe = isRipe;

    }
    public boolean getIsRipe(){
        return isRipe;
    }


    public void setIsRipe(boolean value){
        this.isRipe = value;
    }


}
