package com.company;

import java.util.Scanner;

public class Reverse_String2 {
    static String reverseWord(String str)
    {
        //Reverse the string str
        String rev = "";
        for(int i = str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println("Enter String : ");
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        System.out.println(reverseWord(str1));
    }
}
