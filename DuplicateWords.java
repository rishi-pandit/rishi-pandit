package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {
    public static void main(String[] args) {
     //   String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
     //   Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";  // Write the RegEx matching repeated words here .
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE); // Insert the correct Pattern flag here.
        Scanner sc = new Scanner(System.in);
        int numSe = Integer.parseInt(sc.nextLine());

        while(numSe-- > 0){
            String input = sc.nextLine();

            Matcher m = p.matcher(input);
            // Check for subsequences of input that match the compiled pattern
            while(m.find())
            {
                input = input.replaceAll(m.group(),m.group(1));
            }

            //Print the modified sentences.
            System.out.println(input);

        }
        sc.close();

    }
}
