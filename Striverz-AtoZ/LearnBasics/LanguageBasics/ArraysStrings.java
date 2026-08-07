package LanguageBasics;
import java.util.*;

public class ArraysStrings {
    public static void main(String[] args){
        //arrayIO();
        //lengthStr();
        //modify();
        //access();
        compare();
    }

    static void arrayIO(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i : arr){
            System.out.print(i + " ");
        }
        sc.close();
    }

    static void lengthStr(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.length());
        sc.close();
    }

    static void modify(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String neww = sc.nextLine();
        neww += s;

        System.out.println(s);
        System.out.println(neww);

        sc.close();
    }

    static void access(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (int i=0; i<s.length(); i++){
            System.out.print(s.charAt(i) + " ");
        }
        sc.close();
    }

    static void compare(){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(s1.equals(s2));
        sc.close();
    }
}
