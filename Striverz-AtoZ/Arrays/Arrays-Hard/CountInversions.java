import java.util.*;

public class CountInversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long count = 0;
        for (int size = 1; size < n; size *= 2) {
            for (int left = 0; left < n - size; left += 2 * size) {
                int mid = left + size;
                int right = Math.min(left + 2 * size, n);

                int i = left;
                int j = mid;

                int[] temp = new int[right - left];
                int k = 0;

                while (i < mid && j < right) {
                    if (arr[i] <= arr[j]) {
                        temp[k++] = arr[i++];
                    } else {
                        temp[k++] = arr[j++];
                        count += mid - i;
                    }
                }

                while (i < mid) {
                    temp[k++] = arr[i++];
                }

                while (j < right) {
                    temp[k++] = arr[j++];
                }

                for (int x = 0; x < temp.length; x++) {
                    arr[left + x] = temp[x];
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}