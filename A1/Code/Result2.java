package com.company;
import java.util.Scanner;
public class Result2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the details of three subject ");
        for(int j=0;j<3;j++){
            System.out.println("Enter the number of First Subject");
            int A=sc.nextInt();
            System.out.println("Enter the number of Second Subject");
            int B=sc.nextInt();
            System.out.println("Enter the number of Third Subject");
            int C=sc.nextInt();
            int total=A+B+C;
            int avg=total/3;
            System.out.println("Total scored is "+total);
            System.out.println("Average is "+avg);

        }

    }

}
