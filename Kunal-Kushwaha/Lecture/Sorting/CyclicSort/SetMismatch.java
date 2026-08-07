// https://leetcode.com/problems/set-mismatch/
// Leet Code - 645

package Sorting.CyclicSort;

public class SetMismatch {
    public static void main(String[] args) {
        int arr[] = {1,2,2,4,5};
        int[] result = missingNumber(arr);
        System.out.println("Duplicate: " + result[0]);
        System.out.println("Missing: " + result[1]);
    }
    
    static int[] missingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index + 1){
                return new int[] {arr[index], index+1};
            }
        }
        return new int[] {-1,-1};
    }
    
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
