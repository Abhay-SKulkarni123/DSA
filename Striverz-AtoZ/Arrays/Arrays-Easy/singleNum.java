import java.util.*;

public class singleNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int xor = 0;
        for (int x : arr){
            xor = xor ^ x;
        }
        System.out.println("Single Number : " + xor);
        sc.close();
    }
}
