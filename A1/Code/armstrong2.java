package com.company;

import java.util.Scanner;

public class armstrong2 {
    public static void main(String[] args) {
        for(int n=100;n<999;n++) {

            int  temp,r,res=0;
            temp=n;
            while(temp!=0){
                r=temp % 10;
                res= res+(r*r*r);
                temp=temp/10;
            }
            if(res==n)
                System.out.println(n +" is an Armstrong number.");
        }
    }
}
