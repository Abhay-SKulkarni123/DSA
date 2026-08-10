// LC 724 - https://leetcode.com/problems/find-pivot-index/submissions/2101324218/
import java.util.*;

public class pivotIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int total = 0;
        for (int x : arr){
            total += x;
        }

        int left = 0;
        for (int i=0; i<n; i++){
            int right = total - left - arr[i];
            if(left == right){
                System.out.println(i);
                return;
            }
            left += arr[i];
            sc.close();
        }
        System.out.println(-1);
    }
}
