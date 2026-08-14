// LC 560 - https://leetcode.com/problems/subarray-sum-equals-k/
import java.util.*;

class SubarraySumK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;

        for (int num : arr){
            sum += num;
            if (map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum , 0) + 1);
        }
        System.out.println(count);
        sc.close();;
    }
}