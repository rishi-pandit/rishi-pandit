/*package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

 /*   public static String findDay(int month, int day, int year) {

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

*/







package com.company;
import java.time.LocalDate;
import java.util.Scanner;

public class Time_dateEx_12 {
    public static String getDay(String day,String month,String year){
        int d= Integer.parseInt(day);
        int m= Integer.parseInt(day);
        int y= Integer.parseInt(day);
        LocalDate it = LocalDate.of(y,m,d);
        return it.getDayOfWeek().name();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String month=sc.next();
        String day = sc.next();
        String year =sc.next();
        System.out.println(getDay(day, month,year));

    }
}
