// LC 15 - https://leetcode.com/problems/3sum/description/

import java.util.*;

class threeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        Set<List<Integer>> res = new HashSet<>();
        for (int i=0; i<n-1; i++){
            HashSet<Integer> set = new HashSet<>();
            for (int j=i+1; j<n; j++){
                int req = -(arr[i]+arr[j]);
                if(set.contains(req)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(req);
                    
                    Collections.sort(temp);
                    res.add(temp);
                }
                set.add(arr[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(res);
        System.out.println(ans);

        sc.close();
    }
}
