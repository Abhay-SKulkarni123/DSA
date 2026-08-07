// Leetcode Problem : 7
// https://leetcode.com/problems/reverse-integer/

package Maths;
import java.util.*;

public class Reverse {
    public static void main(String[] args){
        Reverse2();
    }

    static void Reverse1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int rem = 0;
        while(n>0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println(rev);
        sc.close();
    }

    // Along with Edge Cases
    static void Reverse2(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rem = 0;
        int rev = 0;
        while(n != 0){
            rem = n % 10;

            if(rev > Integer.MAX_VALUE || (rev == Integer.MAX_VALUE / 10 && rev > 7)){
                System.out.println(0);
            }
            if(rev < Integer.MIN_VALUE || (rev == Integer.MIN_VALUE / 10 && rev < -8)){
                System.out.println(0);
            }

            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.print(rev);
        sc.close();
    }
}
