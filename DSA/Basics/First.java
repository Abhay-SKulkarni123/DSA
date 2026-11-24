package Basics;
import java.util.*;

public class First {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        // temperature();
        // prime();
        // primitives();
        // TypeCasting();
        // eveodd();
        // greeting();
        // SI();
        // currency();
        // fib();
        // pal();
        // arm();
        // largestOf2();
        // Calculator();
    }

    static void temperature(){
        float tempC = sc.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);
    }

    static void prime(){
        int n = sc.nextInt();
        if (n <= 1){
            System.out.println("Neither a Prime nor a Composite.");
            return;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                System.out.println("Not a Prime.");
                return;
            }
            c++;
        }
        if (c * c > n){
            System.out.println("Prime.");
        }
    }

    static void primitives(){
        // int rollno = 64;
        // char letter = 'r';
        // float marks = 98.67f;
        // double largeDecimalNumbers = 4567654.4567;
        // long largeInteger = 34567834567876543L;
        // boolean check = false;

        float c = 30.6f;
        c++;
        c = (int)(c) + 1;
        System.out.println(c);
    }

    static void TypeCasting(){
        // Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        // type casting
        // int num = (int)(67.56f);
//        System.out.println(num);

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//
//        System.out.println(d);

//        byte b = 50;
//        b = b * 2;

//        int number = 'A';
//        System.out.println("你好");

//        System.out.println(3 * 6);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }

    static void eveodd(){
        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }

    static void greeting(){
        String name = sc.nextLine();
        System.out.println("Welcome, " + name + "!");
    }

    static void SI(){
        double p = sc.nextFloat();
        double t = sc.nextFloat();
        double r = sc.nextFloat();

        double si = (p * t * r) / 100;
        System.out.println("The Simple Interest is " + si);
    }

    static void currency(){
        double inr = sc.nextDouble();
        if (inr < 0) {
            System.out.println("Invalid amount.");
            return;
        }
        double exchangeRate = 96.8;
        double usd = inr / exchangeRate;
        System.out.printf("USD: %.2f%n", usd);
    }

    static void fib(){
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }

    static void pal(){
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    
    static void arm() {
        int start = sc.nextInt();
        int end = sc.nextInt();
        if (start < 0 || end < 0 || start > end) {
            System.out.println("Invalid range.");
            return;
        }
        for (int num = start; num <= end; num++) {
            int temp = num;
            int digits = String.valueOf(num).length();
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;

                sum += (int) Math.pow(digit, digits);

                temp /= 10;
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }

    static void largestOf2(){
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b){
            System.out.println("The Largest of Two Numbers is " + a);
        }
        else if (b > a) {
            System.out.println("The Largest of Two Numbers is " + b);
        }
        else {
            System.out.println("Both the Numbers are Equal");
        }
    }

    static void Calculator(){
        long ans = 0;        
        while(true){
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                long a = sc.nextInt();
                long b = sc.nextInt();
                if (op == '+'){
                    ans = a + b;
                }
                if (op == '-'){
                    ans = a - b;
                }
                if (op == '*'){
                    ans = a * b;
                }
                if (op == '/'){
                    if(b != 0){
                        ans = a / b;
                    }
                }
                if (op == '%'){
                    ans = a % b;
                }
            }
            else if (op == 'x' || op == 'X'){
                break;
            }
            else {
                System.out.println("Invaid Operator.");
            }
            System.out.println(ans);
        }
    }
}
