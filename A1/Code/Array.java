package com.company;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int[] arr={5,12,14,6,78,19,1,23,35,37,7,52,86,47};
        int val=19;
        for(int i=0;i<14;i++){
            if(arr[i]==val){
                System.out.println("The index of the number is "+i);
            }
        }
    }
}
