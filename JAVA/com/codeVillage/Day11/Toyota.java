package com.codeVillage.Day11;

public class Toyota extends Vehicle {

    protected String shiftPaddles = "";
    private String transmission = "";

    public static void offroadMode(){

        System.out.println("Car Off road mode enabled..");
    }


    public String getShiftPaddles() {
        return shiftPaddles;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
