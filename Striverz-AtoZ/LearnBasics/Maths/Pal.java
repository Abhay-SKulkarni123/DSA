// Leetcode Problem : 09
// https://leetcode.com/problems/palindrome-number/description/

package Maths;
import java.util.*;

public class Pal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int org = n;
        int rem = 0;
        int rev = 0;

        while(n > 0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println(org == rev);
        sc.close();
    }
}
