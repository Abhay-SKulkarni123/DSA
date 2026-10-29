package Arrays;
import java.util.*;

public class Equilibrium {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // equal1(arr, n);
        // equal2(arr, n);
        equal3(arr, n);

        sc.close();
    }

    static void equal1(int[] arr, int n){
        for (int i=0; i<n; i++){
            int left = 0;
            int right = 0;
            for (int j=0; j<i; j++){
                left += arr[j];
            }

            for (int j=i+1; j<n; j++){
                right += arr[j];
            }

            if (left == right){
                System.out.println(i);
            }
        }        
    }

    static void equal2(int[] arr, int n){
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = 0;
        for (int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + arr[i-1];
        }

        suffix[n-1] = 0;
        for (int i=n-2; i>=0; i--){
            suffix[i] = suffix[i+1] + arr[i+1];
        }

        boolean found = false;
        for (int i=0; i<n; i++){
            if (prefix[i] == suffix[i]){
                System.out.println(i);
                found = true;
            }
        }

        if (!found){
            System.out.println("No Equilibrium.");
        }
    }

    static void equal3(int[] arr, int n){
        int sum = 0;
        for (int x : arr){
            sum += x;
        }

        int left = 0;
        boolean found = true;
        for (int i=0; i<n; i++){
            int right = sum - left - arr[i];

            if (left == right){
                System.out.println(i);
                found = true;
            }
            left += arr[i];
        }
        if (!found){
            System.out.println("No Equilibrium.");
        }
    }
}
