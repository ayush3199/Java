package com.company;
import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int  temp,r,res=0;
        temp=n;
        while(temp!=0){
            r=temp % 10;
            res= res+(r*r*r);
            temp=temp/10;
        }
        if(res==n)
            System.out.println(n +" is an Armstrong number.");
        else
            System.out.println(n+" is not an Armstrong number.");


    }
}