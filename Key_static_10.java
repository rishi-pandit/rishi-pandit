package com.company;


import java.util.Scanner;

public class Key_static_10 {
    private static int B;
    private static int H;
    private static boolean flag;

    static{
        Scanner sc = new Scanner(System.in);
        B=sc.nextInt();
        H=sc.nextInt();
        sc.close();
        if(B<=0 || H<= 0)
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
        else
        {
            flag = true;
        }
    }
    public static void main(String[] args) {
        if(flag){
            int area = B*H;
            System.out.println(area);
        }
    }// end of main
}//end of class
