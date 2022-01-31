package com.company;

public class String_02 {
    public static void main(String[] args) {

        String str1 = "Hello World,";
        String str2 = "How are you";

        System.out.println(str1+" "+str2);
        //first method

        String str3 =str1.concat(str2);
        //second method
        System.out.println(str3);

        String str4 = String.join("",str1,str2);
        //third method
        System.out.println(str3);
    }
}
