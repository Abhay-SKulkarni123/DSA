// LC 152 - https://leetcode.com/problems/maximum-product-subarray/
import java.util.Scanner;

public class KadanesProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int currentMax = arr[0];
        int currentMin = arr[0];
        int maxProduct = arr[0];

        for (int i = 1; i < n; i++) {
            int num = arr[i];
            if (num < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }
            currentMax = Math.max(num, currentMax * num);
            currentMin = Math.min(num, currentMin * num);
            maxProduct = Math.max(maxProduct, currentMax);
        }
        System.out.println(maxProduct);
        sc.close();
    }
}
