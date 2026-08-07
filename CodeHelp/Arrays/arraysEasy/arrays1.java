package Arrays.arraysEasy;
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
        
        sc.close();
    }
}
