package Intro;

import java.util.Scanner;

public class Problems1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // boolean result = isPrime(n);
        // System.out.println(result);

        for (int i=100; i<=1000; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
        
        sc.close();
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a  = sc.nextInt();
        System.out.print("Enter another Number : ");
        int b  = sc.nextInt();
        int sum = a + b;
        System.out.println("The Sum is "+ sum);

        sc.close();
    }

    static void greet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = sc.nextLine();
        System.out.println("Hello "+ name);

        sc.close();
    }

    static boolean isPrime (int n) {
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n%c == 0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }

    static boolean isArmstrong (int n) {
        int original = n;
        int sum = 0;        
        
        while (n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;    
    }

    public static float ctof(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float c = sc.nextFloat();

        float f = (c * 9/5) + 32;
        System.out.print("Temperature in Fahrenheit: " + f);

        sc.close();
        return f;
    }
}
