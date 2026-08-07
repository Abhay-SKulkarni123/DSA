package Intro;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Neither prime nor composite");
        }

        for(int c=2; c*c < n; c++){
            if(n % c == 0){
                System.out.println("Not a Prime");
                return;
            }
        sc.close();
        }
        System.out.println("Prime");        
    }
}
