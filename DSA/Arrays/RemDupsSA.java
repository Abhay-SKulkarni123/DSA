package Arrays;
import java.util.*;

public class RemDupsSA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // rem1(arr, n);
        // rem2(arr, n);
        rem3(arr, n);

        sc.close();
    }

    static void rem1(int[] arr, int n){
        int[] temp = new int[n];
        int k = 0;

        for (int i=0; i<n; i++){
            boolean duplicate = false;

            for (int j=0; j<k; j++){
                if (temp[j] == arr[i]){
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate){
                temp[k] = arr[i];
                k++;
            }
        }

        for (int i=0 ;i<k; i++){
            arr[i] = temp[i];
        }

        for (int i=0; i<k; i++){
            System.out.print(arr[i] + " ");
        }
    }   
    
    static void rem2(int[] arr, int n){
        int[] temp = new int[n];
        int k = 1;
        temp[0] = arr[0];

        for (int i=1; i<n; i++){
            if (arr[i] != temp[k-1]){
                temp[k] = arr[i];
                k++;
            }
        }

        for (int i=0; i<k; i++){
            arr[i] = temp[i];
        }

        for (int i=0; i<k; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void rem3(int[] arr, int n){
        int k = 0;

        if (n > 0){
            k = 1;

            for (int i=0; i<n; i++){
                if (arr[i] != arr[k-1]){
                    arr[k] = arr[i];
                    k++;
                }
            }
        }

        for (int i=0; i<k; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
