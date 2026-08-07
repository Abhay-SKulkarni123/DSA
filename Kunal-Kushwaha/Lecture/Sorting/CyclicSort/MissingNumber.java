// https://leetcode.com/problems/missing-number/
// LeetCode : 268

package Sorting.CyclicSort;

class Main {
    public static void main(String[] args) {
        int[] a = {0,4,2,3};
        System.out.println(missingNumber(a));
    }
    
    static int missingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
    
    static void swap(int[] arr, int second, int first){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}