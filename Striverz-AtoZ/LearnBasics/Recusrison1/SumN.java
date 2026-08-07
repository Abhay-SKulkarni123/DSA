import java.util.*;

public class SumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sum(n));
        sc.close();
    }
    
    static int Sum(int n){
        if(n == 1){
            return 1;
        }
        return n + Sum(n-1);
    }
}
