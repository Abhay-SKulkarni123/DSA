package Maths;
import java.util.*;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int org = n;
        int k = String.valueOf(n).length();

        int rem = 0;
        int sum = 0;

        while(n > 0){
            rem = n % 10;
            sum += (int) Math.pow(rem, k);
            n /= 10;
        }
        System.out.println(sum == org);
        sc.close();
    }
}
