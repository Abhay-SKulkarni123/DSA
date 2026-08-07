package Intro;
import java.util.*;

public class Loops {
    static void voting(){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Eligible To Vote");
        }
        else{
            System.out.println("Ineligible To Vote");
        }
        sc.close();
    }

    static void percentage(){
        Scanner sc = new Scanner(System.in);
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        int marks4 = sc.nextInt();
        int marks5 = sc.nextInt();

        int tot = marks1 + marks2 + marks3 + marks4 + marks5;

        float perc = (tot) / 5.0f;
        System.out.printf("The Percentage of Total Marks : %.2f%%",perc);
        sc.close();
    }

    static void UCLC(){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(Character.isUpperCase(ch)){
            System.out.println(Character.toLowerCase(ch));
        }
        else{
            System.out.println(Character.toUpperCase(ch));
        }
        sc.close();
    }

    static void InpDrop54(){
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        int tot = m1 + m2 + m3 + m4 + m5;

        int least = Math.min(m1, Math.min(m2, Math.min(m3, Math.min(m4, m5))));
        System.out.println("Least of 5 : "+ least);

        tot = tot - least;
        System.out.println("Total : "+ tot);

        float perc = tot / 4.0f;
        System.out.printf("Percentage of Best 4 : %.2f%%", perc);
        sc.close();
    }

    static void oneToN(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.print(i + " ");
        }
        sc.close();
    }

    static void NToOne(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=n; i>=1; i--){
            System.out.print(i + " ");
        }
        sc.close();
    }

    static void multiN(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=10; i++){
            System.out.print(n * i + " ");
        }
        sc.close();
    }

    static void printName(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i=1; i<=10; i++){
            System.out.print(str + " ");
        }
        sc.close();
    }

    static void evenN(){
        Scanner sc = new Scanner(System.in);

        for (int i=1; i<=100; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

    static void divN(){
        Scanner sc = new Scanner(System.in);

        for (int i=50; i<=100; i++){
            if(i % 7 == 0){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

    public static void main(String[] args){
        divN();
    }
}
