package Arrays;
import java.util.*;

public class Rotate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        // subset1(arr, n, k);
        // subset2(arr, n, k);
        subset3(arr, n, k);

        sc.close();
    }

    static void subset1(int[] arr, int n, int k){
        k = k % n;

        for (int i=0; i<k; i++){
            int last = arr[n-1];

            for (int j=n-1; j>0; j--){
                arr[j] = arr[j-1];
            }

            arr[0] = last;
        }

        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void subset2(int[] arr, int n, int k){
        k = k % n;
        int[] temp = new int[n];

        for (int i=0; i<n; i++){
            temp[(i+k)%n] = arr[i];
        }

        for (int i=0; i<n; i++){
            arr[i] = temp[i];
        }

        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void subset3(int[] arr, int n, int k){
        k = k % n;

        rev(arr, 0, n-1);
        rev(arr, 0, k-1);
        rev(arr, k, n-1);

        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void rev(int[] arr, int left, int right){
        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
