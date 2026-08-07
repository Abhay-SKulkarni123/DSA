// https://leetcode.com/problems/find-the-duplicate-number/
// Leetcode : 287

package Sorting.CyclicSort;
import java.util.*;

public class FindDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,2,4,2,2};
        int res = findDuplicate(arr);
         System.out.println("Sorted: " + Arrays.toString(arr));
        System.out.println("Duplicate: " + res);
    }

    static int findDuplicate(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] != i+1){
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct]){
                    swap(arr,i,correct);
                }else{
                    return arr[i];
            }
        }
        else{
            i++;
        }
        }
        return -1;    
    }
    
    static void swap(int[] arr, int second, int first){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
