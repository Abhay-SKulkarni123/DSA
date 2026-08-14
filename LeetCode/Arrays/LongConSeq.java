// LC 128 - https://leetcode.com/problems/longest-consecutive-sequence/

import java.util.*;

public class LongConSeq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr){
            set.add(num);
        }

        int longest = 0;
        for (int num : set){
            if (!set.contains(num-1)){
                int curr = num;
                int len = 1;

                while (set.contains(curr+1)){
                    curr++;
                    len++;
                }

                longest = Math.max(longest, len);
            }
        }
        System.out.println(longest);
        sc.close();
    }
}
