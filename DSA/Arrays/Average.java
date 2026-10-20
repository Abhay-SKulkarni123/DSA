package Arrays;
import java.util.*;

class Average {
    static void Avg1 (int[] arr, int n){
        int sum = 0;
        for (int i=0; i<n; i++){
            sum += arr[i];
        }

        double avg = (double) sum / n;
        System.out.println(avg);
    }

    static void Avg2 (int[] arr){
        double avg = Arrays.stream(arr).average().orElse(0.0);
        System.out.println(avg);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Avg1(arr, n);
        Avg2(arr);

        sc.close();
    }
}
