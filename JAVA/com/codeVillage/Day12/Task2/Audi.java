package com.codeVillage.Day12.Task2;

public class Audi extends Vehicle {


    public Audi(String modelName, String numberPlate, String engineCC, String manufactureYear) {
        super(modelName, numberPlate, engineCC, manufactureYear);
    }

    @Override
    void carDetails() {
        System.out.println("\n\n----AUDI----");
        System.out.println("NUMBER PLATE::" + this.numberPlate);
        System.out.println("MODEL NAME:: " + this.modelName);
        System.out.println("YEAR:: "+ this.manufactureYear);
        System.out.println("ENGINE SIZE:: " +this.engineCC);

    }


    @Override
    void brake() {
        System.out.println(this.modelName+" has braked...");
    }

    @Override
    void accelerate() {
        System.out.println(this.modelName+" is accelerating..");
    }

    @Override
    void Stop() {
        System.out.println(this.modelName + " has stopped");
    }
}
