// 1752 Check if Array Is Sorted and Rotated -  https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

import java.util.*;

class checkSorted {
    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i=0; i<n; i++){
            if (nums[i] > nums[(i+1) % n]) {
                count++;
            }
            if (count > 1){
                return false;
            } 
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        
        System.out.println(check(nums));
        sc.close();
    }
}
