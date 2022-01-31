package com.company;
import java.util.Scanner;
public class result {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);

         System.out.println("Enter the details of three subject ");
         for(int j=0;j<3;j++){
             System.out.println("Enter the number of First Subject");
             int n1=sc.nextInt();
             System.out.println("Enter the number of Second Subject");
             int n2=sc.nextInt();
             System.out.println("Enter the number of Third Subject");
             int n3=sc.nextInt();
             if(n1>60 && n2>60 && n3>60){
                 System.out.println("Passed");
             }
             else if((n1+n2>120)||n1+n3>120||n2+n3>120){
                 System.out.println("Promoted");
             }
             else
                 System.out.println("Failed");

         }

    }
}
