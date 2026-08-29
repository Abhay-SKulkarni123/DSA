package Strings;
import java.util.*;

public class Strings3 {
    static void OnlyDig(String str, int n){
        boolean isDig = true;

        for (int i=0; i<n; i++){
            char ch = str.charAt(i);

            if (ch < '0' || ch > '9'){
                isDig = false;
                break;
            }
        }
        System.out.println(isDig);
    }

    static void CountWords(String str, int n){
        int count = 0;

        for (int i=0; i<n; i++){
            char ch = str.charAt(i);

            if (ch != ' ' && (i == 0 || str.charAt(i - 1) == ' ')){
                count++;
            }
        }
        System.out.println(count);
    }

    static void RemoveAll(String str, int n){
        Scanner sc = new Scanner(System.in);
        char rem = sc.next().charAt(0);

        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()){
            if (c != rem){
                sb.append(c);
            }
        }
        System.out.println(sb);
        sc.close();
    }

    static void RemoveDup(String str, int n){
        StringBuilder ans = new StringBuilder();

        for (int i=0; i<n; i++){
            char ch = str.charAt(i);
            int m = ans.length();
            if (m>0 && ans.charAt(m-1) == ch){
                ans.deleteCharAt(m-1);
            }
            else{
                ans.append(ch);
            }
        }
        System.out.println(ans.toString());
    }

    static void StringComp(String str, int n){
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1));
                result.append(count);
                count = 1;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();

        // OnlyDig(str, n);
        // CountWords(str, n);
        // RemoveAll(str, n);
        // RemoveDup(str, n);
        StringComp(str, n);

        sc.close();
    }
}
