package Arrays.arraysEasy;
import java.util.*;

public class arrays3 {
    static void avgArray (int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.print("Average of Array : " + sum / arr.length);
    }

    static void multiArrayEle10 (int[] arr) {
        for (int i=0; i<arr.length; i++){
            arr[i] *= 10;
        }
        
        for (int x : arr){
            System.out.print(x + " ");
        }
    }

    static void maxArray (int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        System.out.println("Maximum Element in an Array : " + max);
    }

    static void sumPN (int[] arr){
        int sumN = 0;
        int sumP = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] < 0){
                sumN += arr[i];
            }
            else {
                sumP += arr[i];
            }
        }
        System.out.println("The Sum of Negative Elements : " + sumN);
        System.out.println("The Sum of Positive Elements : " + sumP);
        
    }

    static void swapAlt(int[] arr){
        for(int i=0; i<arr.length-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        for (int x : arr){           
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // avgArray(arr);
        // multiArrayEle10(arr);
        // maxArray(arr);
        // sumPN(arr);
        swapAlt(arr);

        sc.close();
    }
}
