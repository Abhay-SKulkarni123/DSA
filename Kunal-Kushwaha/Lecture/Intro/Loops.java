package Intro;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        DoWhile();
    }

    public static void DT(){
        byte b = 42; 
        char c = 'a'; 
        short s = 1024; 
        int i = 50000; 
        float f = 5.67f; 
        double d = 0.1234; 
        double result = (f*b)+(i/c)-(d*s); 
        System.out.println((f*b)+" "+(i/c)+" "+" "+(d*s)); 
        System.out.println(result); 
    }

    public static void For() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
        sc.close();
    }
    
    public static void If() { 
        int salary = 25400; 
        if (salary<= 10000) { 
            salary +=1000; 
        } 
        else if (salary <= 20000) { 
            salary += 2000; 
        } 
        else { 
            salary += 3000; 
        } 
        System.out.println(salary);        
    }

    public static void While() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        while (n <= 5) {
            System.out.println(n);
            n++;

            sc.close();
        }
    }
    
    public static void DoWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        do {
            System.out.println(n);
            n++;
        }
        while (n <= 5);

        sc.close();
    } 
}
