package com.codeVillage.Day12.Task2;

public class VehicleApp {

    public static void main(String[] args) {

        //first Car

        Toyota firstCar = new Toyota("Avensis", "KCA 453W","1500cc","2004");
        Audi secondCar = new Audi("Q7", "KDA 453R", "4000cc","2005");
        Benz thirdCar = new Benz("S-350", "KCX 654F", "3500cc", "2019");


        firstCar.carDetails();
        firstCar.accelerate();

        secondCar.carDetails();
        secondCar.brake();

        thirdCar.carDetails();
        thirdCar.Stop();


    }




}
