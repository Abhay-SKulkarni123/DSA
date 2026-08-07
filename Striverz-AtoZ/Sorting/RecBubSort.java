package Sorting;
import java.util.*;

class RecBubSort {

    static void bubbleSort(int[] arr, int n) {
        // Base case
        if (n == 1) {
            return;
        }

        // One pass of Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recursively sort remaining array
        bubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr, n);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
