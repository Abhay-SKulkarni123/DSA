package Maths;
import java.util.*;

public class Divisors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> res = new ArrayList<>();
        for (int i=1; i*i <= n; i++){
            res.add(i);
            if(i != n/i){
                res.add(n/i);
            }
        }
        Collections.sort(res);
        System.out.print(res);
        sc.close();
    }    
}
