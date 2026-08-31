package Strings;
import java.util.*;

public class StringPal {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isPal(str));
        sc.close();
    }

    static boolean isPal(String str) {
        for(int i=0; i<= str.length() / 2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end){
                return false;
            }
        }
        return true;
    }
}