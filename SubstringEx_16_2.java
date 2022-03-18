/*Skip to content
        Search or jump to…
        Pull requests
        Issues
        Marketplace
        Explore

@rishi-pandit
        Venkadesh-coder
        /
        Hacker-Rank-Codes
        Public
        Code
        Issues
        Pull requests
        Actions
        Projects
        Wiki
        Security
        Insights
        Hacker-Rank-Codes/Java_Substring_Comparisons.java /
@Venkadesh-coder
        Venkadesh-coder Add files via upload
        Latest commit d669589 on Oct 26, 2019
        History
        1 contributor
        76 lines (51 sloc)  2.23 KB

/*
We define the following terms:
Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .
Input Format
The first line contains a string denoting .
The second line contains an integer denoting .
Constraints
 consists of English alphabetic letters only (i.e., [a-zA-Z]).
Output Format
Return the respective lexicographically smallest and largest substrings as a single newline-separated string.
Sample Input 0
welcometojava
3
Sample Output 0
ava
wel
Explanation 0
String  has the following lexicographically-ordered substrings of length :
We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).
The stub code in the editor then prints ava as our first line of output and wel as our second line of output.
*/


        /* CODE  */
package com.company;
import java.util.Scanner;

public class SubstringEx_16_2 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest = largest = s.substring(0, k);

        for (int i=1; i<s.length()-k+1; i++) {
            String subst = s.substring(i, i+k);
            if (smallest.compareTo(subst) > 0)
                smallest = subst;
            if (largest.compareTo(subst) < 0)
                largest = subst;
        }

        return smallest + "\n" + largest;
    }

    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
/*© 2022 GitHub, Inc.
        Terms
        Privacy
        Security
        Status
        Docs
        Contact GitHub
        Pricing
        API
        Training
        Blog
        About */
