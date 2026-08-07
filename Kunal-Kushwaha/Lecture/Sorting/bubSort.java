package Sorting;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {3,2,5,4,1};
        bubbleSort(arr);
        System.out.println("The Sorted Array : " + Arrays.toString(arr));
    }
    
    public static void bubbleSort(int[] arr){
        boolean swapped;
        
        for (int i = 0; i < arr.length; i++){
            swapped = false;
            for (int j = 1; j <= arr.length - i - 1; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            
            if(!swapped){
                break;
            }
        }
    }
}