// https://leetcode.com/problems/find-all-duplicates-in-an-array/
// Leet Code - 442 

package Sorting.CyclicSort;

import java.util.*;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int arr[] = {4,2,4,1,2,3,5};
        List<Integer> result = findAllDuplicates(arr);
        System.out.println(result);
    }
    
    public static List<Integer> findAllDuplicates(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index + 1){
                ans.add(arr[index]);
            }
        }
        
        return ans;
    }
    
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}