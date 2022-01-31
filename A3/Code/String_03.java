package com.company;
import java.util.*;
public class String_03 {
    public static void main(String[] args) {

        String str1 = "Java String pool refers to collection of " +
                "Strings which are stored in heap memory";
        String str2 = "java string pool refers to collection of " +
                "Strings which are stored in heap memory";

//        String str1 = str.toLowerCase();
//        System.out.print(str1);
//        String str1 = str.toUpperCase();
//        System.out.print(str1);
//        String str1 = str.replace("a", "$");
//        System.out.print(str1);


        System.out.println(str1.equals(str2));
        System.out.println(Objects.equals(str1,str2));
        System.out.println(str1==str2);
    }
}
