package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyRegex
{
    String num= "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern;

    {
        pattern = num + "." + num + "." + num + "." + num;
    }
}


public class ExJavaRegex_21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String IP = sc.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}
