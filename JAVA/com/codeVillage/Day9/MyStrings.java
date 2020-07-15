package com.thecodevillage.day9;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyStrings {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        //allow user to enter the name
        //if the name is less then 5 characters reject and inform user
        String name="John-1234-6";
        //name = scanner.next();

        System.out.println("Length: "+name.length());

        String str1=name.split("-")[0];
        String str2=name.split("-")[1];
        String str3=name.split("-")[2];

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        String veryLongStr = "254733789089";
        String pref=veryLongStr.substring(0,3);

        //if (!veryLongStr.substring(0,3).equalsIgnoreCase("254"))

        System.out.println(pref);

        Date myDate=new Date();
        System.out.println(myDate);

        //dd/MM/yyyy
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
        String stringDate=formatter.format(myDate);

        System.out.println(stringDate);

        formatter=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        stringDate=formatter.format(myDate);

        System.out.println(stringDate);


        formatter=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        stringDate=formatter.format(myDate);

        System.out.println(stringDate);

        formatter=new SimpleDateFormat("dd MMMM yyyy hh:mm:ss");
        stringDate=formatter.format(myDate);

        System.out.println(stringDate);


    }
}
