// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// Leetcode : 852

package BS;

import java.util.Scanner;

public class PeakIndexInMountainArray {

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // You are in the decreasing part of the mountain
                end = mid;
            } else {
                // You are in the increasing part of the mountain
                start = mid + 1;
            }
        }

        // start == end and pointing to peak element
        return start;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter mountain array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peakIndex = peakIndexInMountainArray(arr);

        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);

        sc.close();
    }
}
