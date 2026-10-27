package Arrays;
import java.util.*;

public class MaxEle2D {
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

        // rowMax(arr, n, m);
        // colMax(arr, n, m);
        totalMax(arr, n, m);

        sc.close();
    }

    static void rowMax (int[][] arr, int n, int m){
        for (int i=0; i<n; i++){
            int max = Integer.MIN_VALUE;
            for (int j=0; j<m; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            System.out.println("Max of Row " + (i+1) + " : " + max);
        }
    }

    static void colMax (int[][] arr, int n, int m){
        for (int j=0; j<m; j++){
            int max = Integer.MIN_VALUE;
            for (int i=0; i<n; i++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            System.out.println("Max of Column " + (j+1) + " : " + max);
        }
    }

    static void totalMax (int[][] arr, int n, int m){
        int max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){            
            for (int j=0; j<m; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Total Max : " + max);
    }
}
