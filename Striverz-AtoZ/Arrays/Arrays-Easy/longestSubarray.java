import java.util.*;

class longestSubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = i + 1;
            }
            if (map.containsKey(sum - k)) {
                int prevIndex = map.get(sum - k);
                maxLen = Math.max(maxLen, i - prevIndex);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        System.out.println("The length of longest subarray having sum k : " + maxLen);
        sc.close();
    }
}