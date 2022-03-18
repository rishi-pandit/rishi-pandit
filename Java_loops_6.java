package com.company;

import java.util.Scanner;

public class Java_loops_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1; i<=10; i++){
            int result = a*i;
            System.out.printf("%d x %d = %d\n",a,i,result);
        }
    }
}
