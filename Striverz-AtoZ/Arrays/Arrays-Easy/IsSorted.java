import java.util.*;

public class IsSorted {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        boolean asc = true;
        boolean desc = true;
        for (int i=1; i<n; i++){
            if(arr[i] < arr[i-1]){
                asc = false;
            }
            else if (arr[i] > arr[i-1]){
                desc = false;
            }
        }

        if (asc || desc){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }

        sc.close();
    }    
}
