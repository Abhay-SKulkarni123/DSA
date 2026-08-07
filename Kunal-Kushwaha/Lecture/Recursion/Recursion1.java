package Recursion;

public class Recursion1 {
    static int fib (int n) {
        if (n < 2) {
            return n;
        } 
        return fib(n-1) + fib(n-2);
    }
    
    static int BinarySearch (int[] arr, int tar, int start, int end) {
        if (start > end){
            return -1;
        }
        
        int mid = start + (end - start) / 2; 
        if (arr[mid] == tar) {
            return mid;
        }
        if (tar < arr[mid]) {
            return BinarySearch (arr, tar, start, mid -1);
        }
        return BinarySearch (arr, tar, mid + 1, end);
    }

    public static void main(String[] args){
        // int a = fib(4);
        // System.out.println(a);

        int[] arr = {1, 2, 4, 5, 7, 8, 9, 15, 18, 19};
        int tar = 19;
        int result = BinarySearch(arr, tar, 0, arr.length - 1);
        System.out.println("The required element is at index " + result);
    }
}
