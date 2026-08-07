package Intro;
import java.util.*;

public class Problems2 {

    public static void ul() { 
        Scanner sc = new Scanner (System.in); 
        char ch = sc.next().trim().charAt(0); 

        if (ch >= 'a' && ch <= 'z'){ 
        System.out.println("Lowercase"); 
        } 
        else if (ch >= 'A' && ch <= 'Z') { 
        System.out.println("Uppercase"); 
        }
        else {
        System.out.println("Not an alphabet");
        } 
        sc.close();
    } 

    public static int fib() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b+a;
            a = temp;
            count ++;
        }
        System.out.println("The " + n + "th Fibonacci number is: " + b);
        sc.close();
        return a;
    }

    public static int freq() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter the number to find frequency : ");
        int a = sc.nextInt();
        int count = 0;
        
        while (n>0){
            int rem = n % 10;
            if(rem == a){
                count ++;
            }
            n = n/10;
        }
        System.out.println("Frequency of " + a + ": " + count);
        sc.close();
        return count;
    }

    public static int rev() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int ans = 0;
        
        while (n > 0){
            int rem = n % 10;
            n = n/10;
            ans = ans * 10 + rem;
        }
        System.out.println("Reversed number: " + ans);
        sc.close();
        return ans;
    }

    public static int calc() {
        Scanner sc = new Scanner(System.in);
        int ans = 0; 
        while (true) { 
            // take the operator as input 
            System.out.print("Enter the operator: "); 
            char op = sc.next().trim().charAt(0); 
        
         if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') { 
                // input two numbers 
                System.out.print("Enter two numbers: "); 
                int num1 = sc.nextInt(); 
                int num2 = sc.nextInt(); 
 
                if (op == '+') { 
                    ans = num1 + num2; 
                } 
                if (op == '-') { 
                    ans = num1 - num2; 
                } 
                if (op == '*') { 
                    ans = num1 * num2; 
                } 
                if (op == '/') { 
                    if (num2 != 0) { 
                        ans = num1 / num2; 
                    } 
                } 
                if (op == '%') { 
                    ans = num1 % num2; 
                } 
            } else if (op == 'x' || op == 'X') { 
                break; 
            } else { 
                System.out.println("Invalid operation!!"); 
            } 
            System.out.println(ans);
        }
        sc.close();
        return ans;
    }

    public static int swtch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int day = sc.nextInt(); 

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day number");
        }
        sc.close();
        return day;
    }

    public static void main(String[] args) {
        fib();
    }
}
