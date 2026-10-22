package Arrays;
import java.util.*;

public class Largest {
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

        // large1(arr, n);
        // large2(arr, n);
        // large3(arr, n);

        sc.close();
    }

    // Brute Force - Sort and print last element
    static void large1(int[] arr, int n){
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
    }

    // Better - Linear Search
    static void large2(int[] arr, int n){
        int large = arr[0];

        for (int i=0; i<n; i++){
            if (arr[i] > large){
                large = arr[i];
            }
        }        
        System.out.println(large);
    }

    static void large3(int[] arr, int n){
        int large = arr[0];

        for (int i=0; i<n; i++){
            large = Math.max(large, arr[i]);
        }
        System.out.println(large);
    }
}
