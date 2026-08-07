package Recursion;
import java.util.Arrays;

class Solution {

    public int[][] FlippingImage(int[][] image) {

        for (int[] row : image) {

            for (int i = 0; i < (row.length + 1) / 2; i++) {

                int temp = row[i] ^ 1;

                row[i] = row[row.length - i - 1] ^ 1;

                row[row.length - i - 1] = temp;
            }
        }

        return image;
    }

    public static void main(String[] args) {

        int[][] image = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        };

        Solution sol = new Solution();

        int[][] result = sol.FlippingImage(image);

        System.out.println("Flipped and Inverted Image:");

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}