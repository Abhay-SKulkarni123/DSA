package Arrays;
import java.util.*;

public class arrays1 {
    static void printArray(int[] arr) {
        for (int x : arr){
            System.out.print(x + " ");
        }
    }

    static void arraySum(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("The Total Sum of Array : "+ sum);
    } 
    
    static void arrayMulti(int[] arr) {
        int multi = 1;
        for(int i=0; i<arr.length; i++){
            multi = multi * arr[i];
        }
        System.out.println("Multiplication of The Array : "+ multi);
    }

    static void arrayMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The Maximum of Array : "+ max);
    }
    
    static void arrayMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The Minimum Value of Array : "+ min);
    }

    static void secondLarge (int[] arr){
        int n = arr.length;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if (n < 2){
            System.out.println("Doesn't Exist.");
        }

        for (int i=0; i<n; i++){
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE){
            System.out.println("Doesn't Exist");
        }
        else {
            System.out.println(secondLargest);
        }
    }

    static void largeSecondLarge (int[] arr){
        int n = arr.length;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if (n < 2){
            System.out.println("Doesn't Exist.");
        }

        for (int i=0; i<n; i++){
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE){
            System.out.println("Doesn't Exist");
        }
        else {
            System.out.println(largest + " " + secondLargest);
        }
    }

    static void secondSmall (int[] arr){
        int n = arr.length;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        if (n < 2){
            System.out.println("Doesn't Exist.");
        }

        for (int i=0; i<n; i++){
            if (arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < secondSmallest && arr[i] > smallest){
                secondSmallest = arr[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE){
            System.out.println("Doesn't Exist");
        }
        else {
            System.out.println(secondSmallest);
        }
    }

    static void smallSecondSmall (int[] arr){
        int n = arr.length;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        if (n < 2){
            System.out.println("Doesn't Exist.");
        }

        for (int i=0; i<n; i++){
            if (arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < secondSmallest && arr[i] > smallest){
                secondSmallest = arr[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE){
            System.out.println("Doesn't Exist");
        }
        else {
            System.out.println(smallest + " " + secondSmallest);
        }
    }

    static void largeSecondLargeSmallSecondSmall (int[] arr){
        int n = arr.length;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        if (n < 2){
            System.out.println("Doesn't Exist.");
        }

        for (int i=0; i<n; i++){
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }

        for (int i=0; i<n; i++){
            if (arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < secondSmallest && arr[i] > smallest){
                secondSmallest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE){
            System.out.println("Doesn't Exist");
        }
        else if (secondSmallest == Integer.MAX_VALUE){
            System.out.println("Doesn't Exist");
        }
        else {
            System.out.println(largest + " " + secondLargest + " " + smallest + " " + secondSmallest);
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // printArray(arr);
        // arraySum(arr);
        // arrayMulti(arr);
        // arrayMax(arr);
        // arrayMin(arr);
        // secondLarge(arr);
        // largeSecondLarge(arr);
        // secondSmall(arr);
        // smallSecondSmall(arr);
        // largeSecondLargeSmallSecondSmall(arr);
        
        sc.close();
    }
}
