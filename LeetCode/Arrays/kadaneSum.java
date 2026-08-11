// LC 53 - https://leetcode.com/problems/maximum-subarray/

import java.util.*;

class kadaneSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        
        for (int i=0; i<n; i++){
            sum += arr[i];
            max = Math.max(max, sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);
        sc.close();
    }
}