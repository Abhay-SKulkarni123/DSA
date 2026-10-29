package Arrays;
import java.util.*;

public class RemDupsUSA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // rem1(arr, n);
        rem2(arr, n);
        // rem3(arr, n);

        sc.close();
    }

    static void rem1(int[] arr, int n){
        int k = 0;
        for (int i=0; i<n; i++){
            boolean dup = false;
            for (int j=1; j<k; j++){
                if (arr[i] == arr[j]){
                    dup = true;
                    break;
                }
            }

            if(!dup){
                arr[k] = arr[i];
                k++;
            }
        }

        for (int i=0; i<k; i++){
            System.out.print(arr[i] + " ");
        }
    }   
    
    static void rem2(int[] arr, int n){
        Set<Integer> set = new HashSet<>();
        int k = 0;

        for (int i=0; i<n; i++){
            if(set.add(arr[i])){
                arr[k] = arr[i];
                k++;
            }
        }

        for (int i=0; i<k; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void rem3(int[] arr, int n){

    }
}
