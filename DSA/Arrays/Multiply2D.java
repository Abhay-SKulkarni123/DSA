package Arrays;
import java.util.*;

class Multiply2D {
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

        // rowProd(arr, n, m);
        // colProd(arr, n, m);
        totalProd(arr, n, m);

        sc.close();
    }

    static void rowProd (int[][] arr, int n, int m){
        for (int i=0; i<n; i++){
            int product = 1;
            for (int j=0; j<m; j++){
                product *= arr[i][j];
            }
            System.out.println("Product of Row " + (i+1) + " : " + product);
        }
    }

    static void colProd (int[][] arr, int n, int m){
        for (int j=0; j<m; j++){
            int product = 1;
            for (int i=0; i<n; i++){
                product *= arr[i][j];
            }
            System.out.println("Product of Column " + (j+1) + " : " + product);
        }
    }

    static void totalProd (int[][] arr, int n, int m){
        int product = 1;
        for (int i=0; i<n; i++){            
            for (int j=0; j<m; j++){
                product *= arr[i][j];
            }
        }
        System.out.println("Total Product  : " + product);
    }
}
