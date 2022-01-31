package com.company;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int t = 0;
        //length of array is 15 so i take 14 as index

        for(int i=0;i<14; i++) {
            //itrate through array
            for (int j=0; j<14-i; j++){
                if(arr[j]>arr[j+1]){
                    //check if number is greater than other
                    //swap both the number
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println("Sorting using Bubble Sort");
        for (int i=0; i<15; i++){

            System.out.print(arr[i]+" ");
        }
    }
}
