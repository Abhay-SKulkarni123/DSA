// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// LeetCode : 448
package Sorting.CyclicSort;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class findAllMissingNumbers {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        List<Integer> res = sort(arr);
         System.out.println("Sorted: " + Arrays.toString(arr));
        System.out.println("Missing: " + res);
    }
    
    public static List<Integer> sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }
    
    static void swap(int[] arr, int second, int first){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

