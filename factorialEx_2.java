package apna;

import java.util.Scanner;

public class factorialEx_2 {

    public static long  calcFactorial(long n){
        if(n == 1 || n==0){
            return 1;
        }
       long less_fact = calcFactorial(n-1);
       long fact = n  * less_fact;

       return fact;
    }
    public static void main(String[] args) {
       // int n= 5;
       // int ans = calcFactorial(n);
        Scanner sc = new Scanner(System.in);
     //   int n = sc.nextInt();
        System.out.println(calcFactorial(sc.nextLong()));
    }
}
