// LC 493 - https://leetcode.com/problems/reverse-pairs/

import java.util.*;

public class ReversePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long count = 0;
        for (int size = 1; size < n; size *= 2) {
            for (int left = 0; left < n - size; left += 2 * size) {
                int mid = left + size;
                int right = Math.min(left + 2 * size, n);

                int j = mid;
                for (int i = left; i < mid; i++) {
                    while (j < right &&
                           (long) arr[i] > 2L * arr[j]) {
                        j++;
                    }

                    count += j - mid;
                }

                int i = left;
                j = mid;

                int[] temp = new int[right - left];
                int k = 0;

                while (i < mid && j < right) {
                    if (arr[i] <= arr[j]) {
                        temp[k++] = arr[i++];
                    } else {
                        temp[k++] = arr[j++];
                    }
                }

                while (i < mid) {
                    temp[k++] = arr[i++];
                }

                while (j < right) {
                    temp[k++] = arr[j++];
                }

                for (int x = 0; x < temp.length; x++) {
                    arr[left + x] = temp[x];
                }
            }
        }

        System.out.println("Number of reverse pairs: " + count);

        sc.close();
    }
}