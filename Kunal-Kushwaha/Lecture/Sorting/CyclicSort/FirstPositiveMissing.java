// https://leetcode.com/problems/first-missing-positive/
// LeetCode : 41

package Sorting.CyclicSort;

public class FirstPositiveMissing {
    public static void main(String[] args) {
        int[] a = {0,4,2,3};
        System.out.println(missingNumber(a));
    }
    
    static int missingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index + 1){
                return index + 1;
            }
        }
        return arr.length + 1;
    }
    
    static void swap(int[] arr, int second, int first){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}