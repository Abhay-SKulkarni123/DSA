package Arrays;
import java.util.*;

public class Smallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        if (n == 0){
            System.out.println("Enter Elements into the Array.");
        }

        // small1(arr, n);
        // small2(arr, n);
        // small3(arr, n);

        sc.close();
    }

    // Brute Force - Sort and print first element
    static void small1(int[] arr, int n){
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }

    // Better - Linear Search
    static void small2(int[] arr, int n){
        int small = arr[0];

        for (int i=0; i<n; i++){
            if (arr[i] < small){
                small = arr[i];
            }
        }        
        System.out.println(small);
    }

    static void small3(int[] arr, int n){
        int small = arr[0];

        for (int i=0; i<n; i++){
            small = Math.min(small, arr[i]);
        }
        System.out.println(small);
    }
}
