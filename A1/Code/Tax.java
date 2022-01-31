package com.company;
import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       double tax;
        System.out.println("Enter the CTC");
        long ctc= sc.nextInt();
        if(ctc>0 && ctc<=180000){
            tax=0;
            System.out.println("your ctc is in Slab A so your tax is "+tax);
        }
        if(ctc>180000 && ctc<=300000){
            tax=ctc*0.10;
            System.out.println("your ctc is in Slab B so your tax is "+tax);
        }
        if(ctc>300000 && ctc<=500000){
            tax=ctc*0.20;
            System.out.println("your ctc is in Slab C so your tax is "+tax);

        }
        if(ctc>500000 && ctc<=1000000){
            tax=ctc*0.30;
            System.out.println("your ctc is in Slab D so your tax is "+tax);

        }
    }
}
