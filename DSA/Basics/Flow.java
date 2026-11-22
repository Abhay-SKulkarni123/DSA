package Basics;
import java.util.*;

public class Flow {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){       
        
        leap();
        // sum2();
        // multi();
        // hcflcm();
        // sumx();
    }

    static void leap(){
        int n = sc.nextInt();
        if ((n % 400 == 0) || (n % 4 == 0 && n % 100 != 0)){ // Checks for Integer that can be divided by 4 for non 00 ending and Checks divisibility by 400 for 00 ending
            System.out.println("Leap Year.");
        }
        else {
            System.out.println("Not a Leap Year.");
        }
    }

    static void sum2(){
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float sum = a + b;
        System.out.println("The Sum of a and b is "+ sum);
    }

    static void multi(){
        int n = sc.nextInt();
        for (int i=1; i<=10; i++){ // Runs the loop from 1 to 10
            System.out.println(n+" x "+ i +" = "+ n*i);
        }
    }

    static void hcflcm(){
        int a = sc.nextInt();
        int b = sc.nextInt();

        int hcf = 1; // Highest Common Factor
        for (int i=1; i<=a && i<=b; i++){ // Takes smallest number for both until we reach the largest
            if (a % i == 0 && b % i == 0){ // Checks if i divides both
                hcf = i; // Updates hcf if both conditions are true
            }
        }

        int lcm = (a * b) / hcf; // Lowest Common Multiple

        System.out.println("The HCF of a and b is "+ hcf);
        System.out.println("The LCM of a and b is "+ lcm);
    }

    static void sumx(){
        int sum = 0;

        while(true){ //Runs Continuosly
            System.out.print("Enter a Number(Press X to stop) : ");
            String input = sc.next();
            if(input.equalsIgnoreCase("x")){ // Checks for x or X
                break; //Checks for x and Terminates the loop
            }

            int num = Integer.parseInt(input); // Convert String to Integer
            sum += num;
        }
        System.out.println(sum);
    }
}