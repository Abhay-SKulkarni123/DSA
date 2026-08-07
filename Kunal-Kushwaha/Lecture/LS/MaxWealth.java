// Leetcode : 1672
// https://leetcode.com/problems/richest-customer-wealth/description/

package LS;
class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person++){
            int sum = 0;
            for(int account = 0; account< accounts[person].length; account++){
                sum += accounts[person][account];
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {4, 5, 6}
        };

        int result = obj.maximumWealth(accounts);

        System.out.println("Maximum Wealth: " + result);
    }
}