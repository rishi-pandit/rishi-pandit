package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ExString_token_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String[] words= s.split("[^a-zA-Z]+");
        System.out.println(words.length);

        for(String word: words)
            System.out.println(word);
    }
}
