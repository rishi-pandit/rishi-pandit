package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
//import java.util.regex.*;

public class ExRegex_20 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int testcases = Integer.parseInt(sc.nextLine());
       while(testcases>0){
           String pattern = sc.nextLine();
           try{
               Pattern.compile(pattern);
               System.out.println("Valid");

           }
           catch(PatternSyntaxException ex){
               System.out.println("Invalid");
           }
       }
    }
}
/*
3
        ([A-Z])(.+)
        [AZ[a-z](a-z)
        batcatpat(nat
*/