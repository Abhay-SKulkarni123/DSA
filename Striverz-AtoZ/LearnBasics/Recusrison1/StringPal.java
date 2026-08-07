import java.util.Scanner;

public class StringPal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(isPal(s, 0, s.length()-1));
        sc.close();
    }
    
    static boolean isPal(String s, int i, int j){
        if(i >= j){
            return true;
        }
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        return isPal(s, i+1, j-1);
    }
}
