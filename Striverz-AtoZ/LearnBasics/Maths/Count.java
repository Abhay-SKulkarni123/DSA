package Maths;
import java.util.*;

public class Count {
    public static void main(String[] args){
        //Count1();
        Count2();
    }

    static void Count1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        while(n > 0){
            count++;
            n = n / 10;
        }
        System.out.println(count);
        sc.close();
    }

    // Optimised Version
    static void Count2(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = (int) (Math.log10(n) + 1);
        System.out.println(count);
        sc.close();
    }
}
