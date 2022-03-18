package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramEx_18 {
    /*
    1) remove the white spaces
    2)remove case
    3)if they have same no of elements then it is anagram else not
     */
    static boolean isAnagram(String a, String b) {
        // Complete the function
     /*   a = a.replace(" ","");
        b = b.replace(" ","");

        char[] c=a.toCharArray();
        char[] d=b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);

        if(Arrays.equals(c,d))
            return true;
        else
            return false;     */


        if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        int sum = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i=0; i<a.length(); i++) {
                if (a.charAt(i) == c) {
                    sum++;
                }
                if (b.charAt(i) == c) {
                    sum--;
                }
            }
            if (sum != 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        sc.close();
        boolean ret=isAnagram(a,b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
