package com.thecodevillage.day5;




import java.util.Scanner; //

public class calculator2 {

    public static void main(String[] args){
        int a = 0;
        int b = 0;

        Scanner scanner=new Scanner(System.in); //

        System.out.println("Enter Number A");
        a = scanner.nextInt();

        System.out.println("Enter Number B");
        b = scanner.nextInt();


        int sum = 0;
        int multp = 0;
        int divi = 0;
        int subt = 0;
        int modul = 0;

        sum = a +b;
        subt = a -b;
        divi = a / b;
        multp = a * b;
        modul = a % b;

        System.out.println(" ************** ");
        System.out.println("Sum: \t"+sum);
        System.out.println("Mult: \t"+multp);
        System.out.println("Div: \t"+divi);
        System.out.println("Subt: \t"+subt);
        System.out.println("Modulus: \t"+modul);
    }
}
