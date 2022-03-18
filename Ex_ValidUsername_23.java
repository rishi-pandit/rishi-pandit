package com.company;

import java.util.Scanner;

class UsernameValidator{
    // write a regular expression here
    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";
}

public class Ex_ValidUsername_23 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        while(n-- != 0){
            String userName = sc.nextLine();

           // Object UsernameValidator = null;
            if(userName.matches(UsernameValidator.regularExpression)){
                System.out.println("valid");
            }else{
                System.out.println("Invalid");
            }
        }

    }
}
