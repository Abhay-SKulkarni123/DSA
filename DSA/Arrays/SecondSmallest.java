package Arrays;
import java.util.*;

public class SecondSmallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        if (n == 0){
            System.out.println("Enter Elements into the Array.");
        }

        int small = Integer.MAX_VALUE;
        int secondsmall= Integer.MAX_VALUE;
        
        for (int i=0; i<n; i++){
            if (arr[i] < small){
                secondsmall = small;
                small = arr[i];
            }

            else if (arr[i] < secondsmall && arr[i] > small){
                secondsmall = arr[i];
            }
        }
        
        if (n < 2){
            System.out.println("No Second Smallest.");
        }
        else{
            System.out.println(secondsmall);
        }

        sc.close();
    }
}
