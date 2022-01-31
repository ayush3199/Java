package com.company;
import java .util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reg_name = "Ayush";
        String reg_pass = "987654";
        int i = 3;

        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Your Password : ");
        String password = sc.nextLine();


        if (reg_name.equals(name) && reg_pass.equals(password)) {
            System.out.print("Welcome user " + name);

        } else {
            while (i > 0) {
                System.out.println("");
                System.out.println(i+ " attempts left");
                System.out.print("Enter Your Name : ");
                String lname = sc.nextLine();

                System.out.print("Enter Your Password : ");
                String lpassword = sc.nextLine();
                i -= 1;

                if(i == 0)
                {
                    System.out.println("");
                    System.out.print("Contact Admin");
                    break;
                }
                if (reg_name.equals(lname) && reg_pass.equals(lpassword)) {
                    System.out.print("Welcome user " + reg_name);
                    break;
                }
            }
        }
    }

}

