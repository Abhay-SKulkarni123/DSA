package Arrays;
import java.util.*;

public class SecondLargest {
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

        int large = Integer.MIN_VALUE;
        int secondlarge = Integer.MIN_VALUE;
        
        for (int i=0; i<n; i++){
            if (arr[i] > large){
                secondlarge = large;
                large = arr[i];
            }

            else if (arr[i] > secondlarge && arr[i] < large){
                secondlarge = arr[i];
            }
        }
        
        if (n < 2){
            System.out.println("No Second Largest.");
        }
        else{
            System.out.println(secondlarge);
        }

        sc.close();
    }
}
