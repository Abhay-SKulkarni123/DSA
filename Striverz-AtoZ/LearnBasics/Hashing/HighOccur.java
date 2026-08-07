package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighOccur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int max = 0;
        int ele = -1;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                ele = entry.getKey();
            }
        }
        System.out.println(ele);
        sc.close();
    }
}
