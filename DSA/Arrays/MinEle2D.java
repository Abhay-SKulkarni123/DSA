package Arrays;
import java.util.*;

public class MinEle2D {
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

        // rowMin(arr, n, m);
        // colMin(arr, n, m);
        totalMin(arr, n, m);

        sc.close();
    }

    static void rowMin (int[][] arr, int n, int m){
        for (int i=0; i<n; i++){
            int min = Integer.MAX_VALUE;
            for (int j=0; j<m; j++){
                if (arr[i][j] < min){
                    min = arr[i][j];
                }
            }
            System.out.println("Minimum of Row " + (i+1) + " : " + min);
        }
    }

    static void colMin (int[][] arr, int n, int m){
        for (int j=0; j<m; j++){
            int min = Integer.MAX_VALUE;
            for (int i=0; i<n; i++){
                if (arr[i][j] < min){
                    min = arr[i][j];
                }
            }
            System.out.println("Minimum of Column " + (j+1) + " : " + min);
        }
    }

    static void totalMin (int[][] arr, int n, int m){
        int min = Integer.MAX_VALUE;
        for (int i=0; i<n; i++){            
            for (int j=0; j<m; j++){
                if (arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Overall Minimum : " + min);
    }
}
