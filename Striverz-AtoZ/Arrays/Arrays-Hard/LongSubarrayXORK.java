import java.util.*;

public class LongSubarrayXORK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        int xor = 0;
        int count = 0;
        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
            int required = xor ^ k;

            if (map.containsKey(required)) {
                count += map.get(required);
            }
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        System.out.println("Count: " + count);
        sc.close();
    }
}
