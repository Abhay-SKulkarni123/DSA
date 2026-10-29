package Arrays;
import java.util.*;

public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // rev1(arr, n);
        // rev2(arr, n);
        rev3(arr, n);

        sc.close();
    }
    
    static void rev1(int[] arr, int n){
        int[] rev = new int[n];
        int j = 0;
        for (int i=n-1; i>=0; i--){
            rev[j] = arr[i];
            j++;
        }

        for (int i=0; i<n; i++){
            System.out.print(rev[i] + " ");
        }
    }

    static void rev2(int[] arr, int n){
        int left = 0;
        int right = n-1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void rev3(int[] arr, int n){
        for (int i=0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
