package com.codeVillage.Day12.Task2;



abstract class Vehicle {

    protected String modelName;
    protected String numberPlate;
    protected String engineCC;
    protected String manufactureYear;

    public Vehicle(String modelName, String numberPlate, String engineCC, String manufactureYear){
        this.modelName = modelName;
        this.numberPlate = numberPlate;
        this.engineCC = engineCC;
        this.manufactureYear = manufactureYear;

    }


    abstract void carDetails();

    abstract void brake();

    abstract void accelerate();

    abstract void Stop();

}
