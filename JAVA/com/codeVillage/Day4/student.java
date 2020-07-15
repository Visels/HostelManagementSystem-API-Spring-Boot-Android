package com.thecodevillage.day4;

public class Student{

  public static void main(String[] args){
    String name= "John Doe";
    String admissionNo = "233300";
    boolean activityFeePaid = false;
    double feeBalance = 0.00;
    //conditions
    //activityFeePaid = true print Yes
    //if else
    System.out.println("Name: \t"+name);
    System.out.println("Adm: \t"+admissionNo);

    if (feeBalance > 0) {
      activityFeePaid = false;
    } else{
      activityFeePaid = true;
    }

    if(activityFeePaid){
      System.out.println("Fee Paid: \t"+ "YES");
    } else{
      System.out.println("Fee Paid: \t"+ "NO");
    }

    System.out.println("Bal: \t"+feeBalance);

    //feeBalance 10000 - 15000 -> No Accessing library
    //feeBalance more 15000 -> Go Home
    //feeBalance less than 10000 -> Remain in School
    if(feeBalance >= 10000 && feeBalance <=15000){
        System.out.println("STATUS: \t CANNOT ACCESS LIBRARY");
    }

    if(feeBalance > 15000){
        System.out.println("STATUS: \t GO HOME SOONEST");
    }

    if(feeBalance < 10000){
        System.out.println("STATUS: \t REMAIN IN SCHOOL");
    }



  }
}

/*
- Name - String

- admissionno - String

- studentClass - String

- course - String

- gender - String

- address - String

- sport - String

- grade - String

- totalMarks - Integer/Double/float

- room - String

- activityFeePaid - Yes or N0 -boolean

- FeeBalance - double

*/
