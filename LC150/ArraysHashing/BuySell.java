// LC 121 - https://leetcode.com/problems/best-time-to-buy-and-sell-stock

package ArraysHashing;
import java.util.*;

public class BuySell {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // buySell1(arr, n);
        // buySell2(arr, n);

        sc.close();
    }

    static void buySell1(int[] arr, int n){
        int max = 0;
        
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                int profit = arr[j] - arr[i];

                if (profit > max){
                    max = profit;
                }
            }
        }
        System.out.println(max);
    }

    static void buySell2(int[] arr, int n){
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i=0; i<n; i++){
            if (arr[i] < min){
                min = arr[i];
            }

            int profit = arr[i] - min;

            if (profit>max){
                max = profit;
            }
        }
        System.out.println(max);
    }
}
