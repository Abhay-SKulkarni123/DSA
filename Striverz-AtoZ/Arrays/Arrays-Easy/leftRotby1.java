import java.util.*;

public class leftRotby1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int first = arr[0];
        for (int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = first;
        
        for (int x : arr){
            System.out.print(x + " ");
        }
        sc.close();
    }
}