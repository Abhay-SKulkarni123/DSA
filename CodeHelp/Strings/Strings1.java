package Strings;
import java.util.*;

public class Strings1 {
    static void PrintCh (String str, int n){
        for (int i=0; i<n; i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    static void CountCh (String str, int n){
        char[] arr = str.toCharArray();
        int len = arr.length;
        System.out.println(len);
    }

    static void CountVowels(String str, int n){
        int count = 0;
        for (int i=0; i<n; i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }            
        }
        System.out.println(count);
    }

    static void CountConsonants(String str, int n){
        int count = 0;
        for (int i=0; i<n; i++){
            char ch = str.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                count++;
            }            
        }
        System.out.println(count);
    }

    static void ReverseString(String str, int n){
        String rev = "";
        for (int i=n-1; i>=0; i--){
            char ch = str.charAt(i);
            rev = rev + ch;
        }            
        System.out.println(rev);
    }

    static void Palindrome(String str, int n){
        String pal = str;
        String rev = "";
        for (int i=n-1; i>=0; i--){
            char ch = str.charAt(i);
            rev = rev + ch;
        }
        System.out.println(pal.equals(rev));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();

        // PrintCh(str, n);
        // CountCh(str, n);
        // CountVowels(str, n);
        // CountConsonants(str, n);
        // ReverseString(str, n);
        // Palindrome(str, n);

        sc.close();
    }
}
