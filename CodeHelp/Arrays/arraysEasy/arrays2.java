package Arrays.arraysEasy;
import java.util.*;

public class arrays2 {
    static void print2dArray(int[][] arr){
        for (int[] row: arr){
            for (int x : row){
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }

    static void sum2dArray(int[][] arr){
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("Total Sum of 2D Array : "+ sum);
    }

    static void multiply2dArray(int[][] arr){
        int multi = 1;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                multi *= arr[i][j];
            }
        }
        System.out.println("The Product of 2D Array : "+ multi);
    }

    static void max2dArray(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The Maximum Value in 2D Array : "+ max);
    }

    static void min2dArray(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("The Minimum Value in 2D Array : "+ min);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // print2dArray(arr);
        // sum2dArray(arr);
        // multiply2dArray(arr);
        // max2dArray(arr);
        min2dArray(arr);

        sc.close();
    }
}
