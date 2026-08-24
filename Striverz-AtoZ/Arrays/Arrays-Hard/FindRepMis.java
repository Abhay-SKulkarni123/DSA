import java.util.*;

public class FindRepMis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSquareSum = (long) n * (n + 1) * (2L * n + 1) / 6;

        long actualSum = 0;
        long actualSquareSum = 0;

        for (int x : arr) {
            actualSum += x;
            actualSquareSum += (long) x * x;
        }

        long diff = actualSum - expectedSum;
        long squareDiff = actualSquareSum - expectedSquareSum;
        long sum = squareDiff / diff;
        long repeating = (diff + sum) / 2;
        long missing = (sum - diff) / 2;

        System.out.println("Repeating number: " + repeating);
        System.out.println("Missing number: " + missing);

        sc.close();
    }
}