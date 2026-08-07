import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fact(n));
        sc.close();
    }
    
    static int Fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * Fact(n-1);
    }
}
