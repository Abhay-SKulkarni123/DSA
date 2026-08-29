package Strings;
import java.util.*;

public class Strings2 {
    static void LCToUC (String str, int n){
        System.out.print(str.toUpperCase());         
    }

    static void UCToLC (String str, int n){
        System.out.print(str.toLowerCase());         
    }

    static void Freq (String str, int n){
        Scanner sc = new Scanner(System.in);
        char tar = sc.next().charAt(0);
        int count = 0;
        
        for (int i=0; i<n; i++){
            if (str.charAt(i) == tar){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }

    static void MostFreq (String str, int n){
        int[] freq = new int[26];
        for (int i=0; i<n; i++){
            char currChar = str.charAt(i);
            freq[currChar - 'a']++;
        }

        int maxfreq = -1;
        char ans = 'a';

        for (int i=0; i<26; i++){
            if (freq[i] > maxfreq){
                maxfreq = freq[i];
                ans = (char)(i + 'a');
            }
        }
        System.out.println(ans);
    }

    static void RemSpaces (String str, int n){
        String res = "";

        for (int i=0; i<n; i++){
            char ch = str.charAt(i);

            if (ch != ' '){
                res += ch;
            }
        }
        System.out.println(res);
    }

    static void Replace (String str, int n){
        Scanner sc = new Scanner(System.in);

        StringBuilder res = new StringBuilder();
        char tar = sc.next().charAt(0);

        for (int i=0; i<n; i++){
            char ch = str.charAt(i);
            
            if (ch == tar){
                res.append(' ');
            }
            else {
                res.append(ch);
            }
        }    
        System.out.println(res.toString());
        sc.close();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        
        // LCToUC(str, n);
        // UCToLC(str, n);
        // Freq(str, n);
        // MostFreq(str, n);
        // RemSpaces(str, n);
        // Replace(str, n);

        sc.close();
    }
}
