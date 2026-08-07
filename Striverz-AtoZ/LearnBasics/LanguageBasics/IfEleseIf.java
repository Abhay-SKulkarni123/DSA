package LanguageBasics;
import java.util.*;

public class IfEleseIf {
    public static void main(String[] args){
        //ifStmt();
        //ifElseIf();
    }

    static void ifStmt(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Enter a valid Age");
            //return;
        }

        if(n >=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not an Adult");
        }
        sc.close();
    }

    static void ifElseIf(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0 || n > 100){
            System.out.println("Enter a Valid Marks");
            //return;
        }

        if(n >= 90){
            System.out.println("Grade A");
        }

        else if (n >=70 && n < 90){
            System.out.println("Grade B");
        }

        else if(n >= 50 && n < 70){
            System.out.println("Grade C");
        }

        else if(n >= 35 && n < 50){
            System.out.println("Grade D");
        }

        else{
            System.out.println("Failed");
        }
        sc.close();
    } 
}
