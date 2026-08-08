// LC 189 - https://leetcode.com/problems/rotate-array/submissions/2098630679/

import java.util.*;

class rotbyk {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        k = k % n;

        rev(arr, 0, n-1);
        rev(arr, 0, k-1);
        rev(arr, k, n-1);

        for (int x : arr){
            System.out.print(x + " ");
        }

        sc.close();
    }

    public static void rev(int[] arr, int i, int j){
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
