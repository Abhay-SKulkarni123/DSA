package Intro;
import java.util.Scanner;

public class Patterns {
    // Pattern 1 - Solid Square Pattern
    public static void pattern1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

    // Pattern 2 - Solid Rectangular Pattern
    public static void pattern2(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

    // Pattern 3 - Solid Right Angled Triangle
    public static void pattern3(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

    // Pattern 4 - Solid Rhombus Pattern
    public static void pattern4(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

    // Pattern 5 - Inverted Right Angled Triangle
    public static void pattern5(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

    // Pattern 6 - Solid Pyramid Pattern I
    public static void pattern6(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

    // Pattern 7 - Solid Pyramid Pattern II
    public static void pattern7(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n - i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=2 * i - 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

    // Pattern 8 - Inverted Solid Pyramid Pattern
    public static void pattern8(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=n; i>=1; i--){
            for (int j=n-i; j>=1; j--){
                System.out.print("  ");
            }
            for (int j=2*i-1; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

    // Pattern 9 - Hollow Rectangular Pattern
    public static void pattern9(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=6; j++){
                if(i==1 || i==n || j == 1 || j == 6){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    // Pattern 10 - Hollow Right Angled Triangle Pattern
    public static void pattern10(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            if(i == 1 || i == 2 || i == n){
                for (int j=1; j<=i; j++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
                for (int j=1; j<= i-2; j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

    // Pattern 11 - Solid Hollow Pyramid
    public static void pattern11(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    // Pattern 12 - Hollow Diamond
    public static void pattern12() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper Hollow Pyramid
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        // Lower Hollow Inverted Pyramid
        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
        sc.close();
    }

    // Pattern 13 - Buttefly Pattern
    public static void pattern13() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper Half
        for (int i = 1; i <= n; i++) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower Half
        for (int i = n; i >= 1; i--) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }

    // Pattern14 - Solid Diamond
    public static void pattern14() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper Pyramid
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower Inverted Pyramid
        for (int i = n - 1; i >= 1; i--) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }

    // Pattern 15 - Solid Right Angled Triangle Numerical
    public static void pattern15(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    // Pattern 16 - Solid Right Angled Triangle Numbers
    public static void pattern16(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        sc.close();
    }

    // Pattern 17 - Solid Right Angled Triangle Alphabets
    public static void pattern17(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print((char)('A' + j - 1) + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    // Pattern 18 - Solid Right Angled Triangle Reverse Alphabets
    public static void pattern18(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print((char)('E' - j + 1) + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    // Pattern 19 - Solid Pyramid Pattern Numbers
    public static void pattern19(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
        sc.close();
    }

    // Pattern 20 - Solid Pyramid Pattern Alpha
    public static void pattern20(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + i - 1)+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args){
        pattern20();
    }
}
