package com.company;
import java.util.Scanner;
public class Eof_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        while(sc.hasNext()){
            System.out.println(i + " "+ sc.nextLine());
            i++;
        }
        sc.close();
    }
}
