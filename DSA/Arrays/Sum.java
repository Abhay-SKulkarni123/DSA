package Arrays;
import java.util.*;

class Sum {
    static void Sum1 (int[] arr, int n){
        int sum = 0;
        for (int i=0; i<n; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }

    static void Sum2 (int[] arr){
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Sum1(arr, n);
        Sum2(arr);

        sc.close();
    }
}
