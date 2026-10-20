package Arrays;
import java.util.Scanner;

class Product {
    static void Product1 (int[] arr, int n){
        int product = 1;
        for (int i=0; i<n; i++){
            product *= arr[i];
        }
        System.out.println(product);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Product1(arr, n);
        sc.close();
    }
}
