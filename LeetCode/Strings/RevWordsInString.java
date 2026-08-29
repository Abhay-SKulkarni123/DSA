// LC 151 - https://leetcode.com/problems/reverse-words-in-a-string/

package Strings;
import java.util.*;

public class RevWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        int n = words.length-1;
        for (int i=n; i>=0; i--){
            ans.append(words[i]);

            if (i != 0){
            ans.append(" ");
            }
        }        
        System.out.print(ans.toString());
        sc.close();
    }
}
