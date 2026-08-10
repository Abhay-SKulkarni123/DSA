import java.util.*;

public class RemDupSA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        if (n < 1){
            System.out.println(Arrays.toString(arr));
            // return;
        }

        int idx = 1;
        for(int i=1; i<n; i++){
            if(arr[i] != arr[i-1]){
                arr[idx++] = arr[i];
            }
        }

        for (int i=0; i<idx; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
