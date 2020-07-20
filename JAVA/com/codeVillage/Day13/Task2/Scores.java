package com.codeVillage.Day13.Task2;

import java.util.Scanner;


public class Scores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("ENTER THE NUMBER OF SCORES::");
        int arraySize = sc.nextInt();

        int[] data = new int[arraySize];


        int sum = 0;
        int frequency = 0;
        double mean = 0;

        frequency = data.length;


        for(int i = 0; i< data.length;i++){

            System.out.println("Enter value " + (i+1) + ":");
            data[i] = sc.nextInt();


            //total sum
            sum += data[i];
        }


        //mean
        mean = (double) sum/ (double)frequency ;



        //DISPLAYING THE DATA
        System.out.print("\nDATA =\t[ " );

        for(int i: data){
            System.out.print(i + ",  ");
        }


        System.out.print("]");


        System.out.println("\n\nTOTAL SUM::" + Sum(data));
        System.out.println("MEAN::" + Mean(data));



        int[] cloned = new int[5];

        cloned = data.clone();


        for(int value: cloned){

            System.out.println(value);


        }

    }



    public static int Sum(int[] values){
        int sum = 0;
        for(int value: values){
            sum+=value;
        }

        return sum;
    }


    static double Mean(int[] values){
        double frequency = values.length;

        double sum = (double) Sum(values);

        return sum/frequency;
    }


}
