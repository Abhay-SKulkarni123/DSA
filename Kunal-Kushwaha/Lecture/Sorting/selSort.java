package Sorting;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {-200, 0, -250, 200, 150};
        selectionSort(arr);
        System.out.println("The Sorted Array : " + Arrays.toString(arr));
    }
    
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int last = arr.length - i -1;
            int maxIndex = getMaxIndex(arr, 0, last);
            
            swap(arr, maxIndex, last);
        }
    }
    
    public static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        
        for(int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}