import java.util.*;

public class MergeWithoutSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in nums1: ");
        int m = sc.nextInt();
        int[] nums1 = new int[m + 100];
        System.out.println("Enter " + m + " sorted elements of nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.print("Enter number of elements in nums2: ");
        int n = sc.nextInt();
        int[] nums2 = new int[n];
        System.out.println("Enter " + n + " sorted elements of nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        System.out.println("Merged array:");
        for (int x = 0; x < m + n; x++) {
            System.out.print(nums1[x] + " ");
        }
        sc.close();
    }
}
