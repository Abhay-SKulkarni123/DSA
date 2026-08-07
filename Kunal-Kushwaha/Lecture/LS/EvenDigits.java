package LS;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Leetcode : 1295

public class EvenDigits {

    static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }
        return (int) (Math.log10(num)) + 1;
    }

    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};
        int result = findNumbers(nums);
        System.out.println("Numbers with even digits: " + result);
    }
}