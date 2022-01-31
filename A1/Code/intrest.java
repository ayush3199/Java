package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class intrest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount");
        int p= sc.nextInt();
        System.out.println("Enter the rate of intrest");
        double r= sc.nextInt();
        r=r/100;
        System.out.println("Enter the time in year");
        int t=sc.nextInt();
        System.out.println("Enter the number of times that intrest is compounded per unit time");
        int n= sc.nextInt();
        double si=(p*r*t);
        System.out.println(si+" is the simple intrest");
        double amount=p*(Math.pow((1+(r/n)),n*t));

        double ci=amount-p;
        System.out.println(ci +" is the compound intrest");
    }
}
