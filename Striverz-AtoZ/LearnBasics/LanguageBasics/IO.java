package LanguageBasics;
import java.util.*;

public class IO {
    public static void main(String[] args){
        // input();
        //sum();
        //intro();
        //area();
    }

    public static void input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        sc.close();
    }

    public static void sum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        sc.close();
    }

    public static void intro(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("My name is " + name + " and I am " + age + " Years old");
        sc.close();
    }

    public static void area(){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area = Math.PI * r * r;
        System.out.printf("%.2f", area);
        sc.close();
    }
}
