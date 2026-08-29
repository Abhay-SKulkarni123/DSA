package Strings;
import java.util.*;

public class StringPermutation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.length() > s2.length()) {
            System.out.println(false);
            return;
        }

        int[] count = new int[26];

        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }

        int required = s1.length();

        for (int right = 0; right < s2.length(); right++) {
            if (count[s2.charAt(right) - 'a']-- > 0) {
                required--;
            }

            if (right >= s1.length()) {
                if (count[s2.charAt(right - s1.length()) - 'a']++ >= 0) {
                    required++;
                }
            }

            if (required == 0) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
        sc.close();      
    } 
}
    

