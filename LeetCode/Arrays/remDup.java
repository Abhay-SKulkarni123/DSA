// LC 26 - https://leetcode.com/problems/remove-duplicates-from-sorted-array/

import java.util.*;

class remDup {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;

        if (n <= 1){
            return n;
        }

        int idx = 1;
        for (int i=1; i<n; i++){
            if (nums[i] != nums[i-1]){
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        
        int k = removeDuplicates(nums);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }
}