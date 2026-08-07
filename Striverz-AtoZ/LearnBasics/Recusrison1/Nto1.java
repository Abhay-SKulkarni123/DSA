import java.util.*;

class Nto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Num(n);
        System.out.println();
        sc.close();
    }
    
    static void Num(int curr){
        if(curr < 1){
            return;
        }
        System.out.println(curr);
        Num(curr-1);
    }
}