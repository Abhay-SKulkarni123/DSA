import java.util.*;

public class SecondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        if(n < 2){
            System.out.println("Not Possible");
        }

        for (int i=0; i<n; i++){
            if(arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondlargest && arr[i] != largest){
                secondlargest = arr[i];
            }
        }

        if (secondlargest == Integer.MIN_VALUE){
            System.out.println("No Second Largest");
        }
        else{
            System.out.println(secondlargest);
        }
        sc.close();
    }
}
