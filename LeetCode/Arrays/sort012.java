// LC 75 - https://leetcode.com/problems/sort-colors/description/

import java.util.Scanner;

public class sort012 {
    public static void sortColors(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = 0;
        int k = n-1;

        while (j <= k){
            if(arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else if(arr[j] == 1){
                j++;
            }
            else{
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                k--;
            }
        }
        for (int x : arr){
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        sortColors(arr);
        sc.close();
    }
}
