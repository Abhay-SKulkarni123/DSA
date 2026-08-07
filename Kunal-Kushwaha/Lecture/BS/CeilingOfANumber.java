package BS;
import java.util.Scanner;

public class CeilingOfANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Sorted array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Target Value : ");
        int target = sc.nextInt();
        int result = Ceiling(arr, target);
        if(result == -1){
            System.out.println("Ceiling does not exist");
        }
        else{
            System.out.println("The Ceiling Value is : " + result);
        }
        sc.close();
    }

    static int Ceiling(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        // Edge case: target greater than largest element
        if(target > arr[end]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return arr[mid];
            }
        }
       return arr[start];
    }
}