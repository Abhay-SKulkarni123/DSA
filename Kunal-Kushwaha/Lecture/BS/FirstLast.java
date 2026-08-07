package BS;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the Sorted Integer Array : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the Target Value : ");
        int target = sc.nextInt();
        int[] result = searchRange(nums, target);
        System.out.println("First Position : " + result[0]);
        System.out.println("Last Position  : " + result[1]);

        sc.close();
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    static int search(int[] nums, int target, boolean firstIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } 
            else if (target > nums[mid]) {
                start = mid + 1;
            } 
            else {
                ans = mid;
                if (firstIndex) {
                    end = mid - 1;   // move left
                } else {
                    start = mid + 1; // move right
                }
            }
        }
        return ans;
    }
}
