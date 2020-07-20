package com.codeVillage.Day13.Task1;

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


        System.out.println("\n\nTOTAL SUM::" + sum);
        System.out.println("MEAN::" + mean);


    }

}
