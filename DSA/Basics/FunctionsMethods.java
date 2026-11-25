package Basics;
import java.util.*;

public class FunctionsMethods {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        // sum(10, 20);
        // sum(10, 20, 30);
        // fun(10);
        // fun("ASK");
        // isArmstrong();
        // isPrime();
        // swapNum();
        // demo("Abhay", "ASK", "RCB");
        // multiple(35, 43, "Virat Kohli", "Favorite Innings");
    }

    static void sum(int a, int b){
        System.out.println(a + b);
    }

    static void sum(int a, int b, int c){
        System.out.println(a + b + c);
    }

    static void fun(int a){
        System.out.println("First One");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("Second One");
        System.out.println(name);
    }

    static void isArmstrong(){
        int n = sc.nextInt();
        int original = n;
        int sum = 0;

        while (n > 0){
            int rem = n % 10;
            n /= 10;
            sum = sum + rem * rem * rem;
        }

        if (sum == original){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }

    static void isPrime(){
        int n = sc.nextInt();
        if (n <= 1){
            System.out.println("Not a Prime");
            return;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                System.out.println("Not a Prime");
                return;
            }
            c++;
        }
        if (c * c > n){
            System.out.println("Prime");
            return;
        }
    }

    static void swapNum(){
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swapping : " + a + " " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping : " + a + " " + b);
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {
        System.out.println("[" + a + " , " + b + " , " + Arrays.toString(v) + "]");
    }
}
