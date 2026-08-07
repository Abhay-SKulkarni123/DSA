package LS;

public class LinearSearch {
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i=0; i < arr.length; i++) {
            int ele = arr[i];
            if (ele == target) {
                return i;
            }
        }
       return -1;
    }

    static boolean SearchInString (String str, char target){
        // if (str.length() == 0) {
        //     return false;
        // }
        // for (int i=0; i < str.length(); i++) {
        //     if (target == str.charAt(i)) {
        //         return true;
        //     }
        // }
        // return false;
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    static int SearchInRange (int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int ele = arr[index];
            if (ele == target) {
                return index;
            }
        }
        return -1;
    }

    static int[][] findMin (int[][] arr, int target) {
        for ( int i=0; i < arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[][]{{i, j}};
                }
            }
        }
        return new int[][]{{-1, -1}};
    }

    static int findMax(int[][] arr) {
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] > max) {
                max = arr[i][j];
            }
        }
    }

    return max;
}
   
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        // int target = 5;
        // int ans = linearSearch(arr, target);
        // System.out.println(ans);
        
        // String str = "Hello, World!";
        // char target = 'W';
        // boolean isFound = SearchInString(str, target);
        // System.out.println(isFound);

        // int[] arr = {1, 2, 3, 4, 5};
        // int target = 5;
        // int start = 1;
        // int end = 3;
        // int ans = SearchInRange(arr, target, start, end);
        // System.out.println(ans);

        // int[][] arr = {
        //         {10, 20, 30},
        //         {40, 50, 60},
        //         {70, 80, 90}
        // };
        // int target = 800;
        // int[][] result = findMin(arr, target);
        // System.out.println("Target found at: (" + result[0][0] + ", " + result[0][1] + ")");

        int[][] arr = {
            {10, 20, 30},
            {45, 60, 15},
            {7, 80, 9}
        };
        int result = findMax(arr);
        System.out.println("Maximum element: " + result);
    }
}
