package com.codeVillage.Day11;



public class carApplication {

    public static void main(String[] args) {

        Ford firstCar = new Ford();

        Toyota secondCar = new Toyota();


        firstCar.name = " FORD MUSTANG";
        firstCar.regNumber = "KDA 911Q";
        firstCar.color ="VANTABLACK";
        firstCar.valveTransmission = "VARIABLE VALVE TRANSMISSION";



        secondCar.name = "SUPRA";
        secondCar.regNumber = "KDE 345W";
        secondCar.color = "SILVER";
        secondCar.shiftPaddles = "PADDLE SHIFTER AVAILABLE";


        System.out.println("-----FIRST CAR-----");
        System.out.println("Name::" + firstCar.name);
        System.out.println("REG NO::" +firstCar.regNumber);
        System.out.println("COLOR::"+ firstCar.regNumber);
        System.out.println("ENGINE TRANSMISSION::"+ firstCar.valveTransmission);
        firstCar.accelerate();
        firstCar.brake();


        System.out.println("\n\n-----SECOND CAR-----");
        System.out.println("Name::" + secondCar.name);
        System.out.println("REG NO::" +secondCar.regNumber);
        System.out.println("COLOR::"+ secondCar.regNumber);
        System.out.println("PADDLE SHIFTERS::" + secondCar.shiftPaddles);
        secondCar.accelerate();
        secondCar.brake();


    }


}
