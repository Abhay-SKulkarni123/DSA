package Arrays;
import java.util.*;

public class CheckSorted {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // sort1(arr, n);
        sort2(arr, n);

        sc.close();
    }

    static void sort1(int[] arr, int n){
        boolean isSorted = true;
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    isSorted = false;
                    break;
                }
            }
            if(!isSorted){
                break;
            }
        }

        System.out.println(isSorted);
    }

    static void sort2(int[] arr, int n){
        boolean isSorted = true;
        for (int i=0; i<n-1; i++){
            if (arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }

        System.out.println(isSorted);
    }
}
