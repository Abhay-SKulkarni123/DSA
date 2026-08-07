import java.util.*;

public class PrintN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Numbers(1, n);
        sc.close();
    }

    static void Numbers(int curr, int n){
        if(curr > n){
            return;
        }
        System.out.println(curr);
        Numbers(curr + 1, n);
    }
}
