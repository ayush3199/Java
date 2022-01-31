package com.company;

public class String_04 {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer();
        str.append("StringBuffer ");
        str.append("is a peer class of String ");
        str.append("that provides much of ");
        str.append("the functionality of strings ");
        System.out.println(str.toString());



        StringBuffer str1 = new StringBuffer();
        str1.append("It is used to _at the specified index position");
        str1.insert(14, "insert text ");
        System.out.println(str1);

        StringBuffer str2 = new StringBuffer();
        str2.append("This method returns the reserved object on which it was called");
        System.out.println(str2);
        str2.reverse();
        System.out.println(str2);
    }


}
