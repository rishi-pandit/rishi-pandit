package com.company;

import java.util.Scanner;

public class Reverse_String {

    static String reverseWord(String str){
        //Reverse the string str
        char arr[] = str.toCharArray();
        char temp;
        int k = (arr.length)-1;
        for(int i=0; i<arr.length; i++)
        {
            if(i<k)
            {
                temp = arr[i];
                arr[i] = arr[k];
                arr[k]=temp;
            }
            k=k-1;
        }
        String str1 = new String(arr);
        return str1;
    }
    public static void main(String[] args) {
        System.out.println("Enter String.. ");
        Scanner sc= new Scanner(System.in);
        String str1= null;
        str1 = sc.next();
       // String str2 = reverseWord(str1) ;
        System.out.println(reverseWord(str1));
    }
}
