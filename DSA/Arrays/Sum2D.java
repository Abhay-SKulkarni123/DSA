package Arrays;
import java.util.*;

class Sum2D {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i=0; i<n; i++){
            for (int j = 0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // rowSum(arr, n, m);
        // colSum(arr, n, m);
        totalSum(arr, n, m);

        sc.close();
    }

    static void rowSum (int[][] arr, int n, int m){
        for (int i=0; i<n; i++){
            int sum = 0;
            for (int j=0; j<m; j++){
                sum += arr[i][j];
            }
            System.out.println("Sum of Row " + (i+1) + " : " + sum);
        }
    }

    static void colSum (int[][] arr, int n, int m){
        for (int j=0; j<m; j++){
            int sum = 0;
            for (int i=0; i<n; i++){
                sum += arr[i][j];
            }
            System.out.println("Sum of Column " + (j+1) + " : " + sum);
        }
    }

    static void totalSum (int[][] arr, int n, int m){
        int sum = 0;
        for (int i=0; i<n; i++){            
            for (int j=0; j<m; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("Total Sum  : " + sum);
    }
}
