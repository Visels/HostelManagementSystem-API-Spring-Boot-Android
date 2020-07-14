package com.codeVillage.Day11;

public class FruitClass {


    public static void main(String[] args) {

        MangoFruit mango = new MangoFruit("Magnus Carlsen", "Yellow", true, 67,"Alpean Mango");

        OrangeFruit orange = new OrangeFruit("Odisei Orange", "Blue", false, 7,true);

        GuavaFruit guava = new GuavaFruit("Dan charlsen", "Grey", false, 6, "Very Ripe");

        Alphonso alphonso = new Alphonso("Mareca Alphonso", "Silver", 10, false,"Bavarian Mango", true);


        System.out.println("\n\n-----MANGO FRUIT-----");
        System.out.println("Name:: "+ mango.getName());
        System.out.println("Color:: "+ mango.getColor());
        System.out.println("Weight:: "+ mango.getWeight());
        System.out.println("Perishability::"+ mango.getisPerishable());
        System.out.println("Mango Type:: " + mango.getMangoType());


        System.out.println("\n\n-----ORANGE FRUIT-----");
        System.out.println("Name:: "+ orange.getName());
        System.out.println("Color:: "+ orange.getColor());
        System.out.println("Weight:: "+ orange.getWeight());
        System.out.println("Perishability::"+ orange.getisPerishable());
        System.out.println("Has Seeds:: " + orange.getHasSeeds());


        System.out.println("\n\n-----GUAVA FRUIT-----");
        System.out.println("Name:: "+ guava.getName());
        System.out.println("Color:: "+ guava.getColor());
        System.out.println("Weight:: "+ guava.getWeight());
        System.out.println("Perishability::"+ guava.getisPerishable());
        System.out.println("How Ripe:: " + guava.getHowRipe());


        System.out.println("\n\n-----ALPHONSO MANGO FRUIT-----");
        System.out.println("Name:: "+ alphonso.getName());
        System.out.println("Color:: "+ alphonso.getColor());
        System.out.println("Weight:: "+ alphonso.getWeight());
        System.out.println("Perishability::"+ alphonso.getisPerishable());
        System.out.println("Is ripe " + alphonso.getIsRipe());









    }






}
