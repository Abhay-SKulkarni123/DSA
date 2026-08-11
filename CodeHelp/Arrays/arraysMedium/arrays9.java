package Arrays.arraysMedium;
import java.util.*;

public class arrays9 {
    static void rowSum(int[][] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int m = arr[0].length;
        for (int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<m; j++){
                sum += arr[i][j];
            }
            list.add(sum);
        }
        System.out.println(list);
    }

    static  void columnSum(int[][] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int m = arr[0].length;
        for (int j=0; j<m; j++){
            int sum = 0;
            for(int i=0; i<n; i++){
                sum += arr[i][j];
            }
            list.add(sum);
        }
        System.out.println(list);
    }

    static void waveMatrix(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int j=0; j<m; j++){
            if((j&1) == 1){
                for (int i=n-1; i>=0; i--){
                    list.add(arr[i][j]);
                }
            }
            else{
                for(int i=0; i<n; i++){
                    list.add(arr[i][j]);
                }
            }
        }
        System.out.println(list);
    }

    static void transposeMatrix(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
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

        // rowSum(arr);
        // columnSum(arr);
        // waveMatrix(arr);
        transposeMatrix(arr);

        sc.close();
    }
}
