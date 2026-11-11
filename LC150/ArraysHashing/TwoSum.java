// LC 1 - https://leetcode.com/problems/two-sum

package ArraysHashing;
import java.util.*;

public class TwoSum {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int tar = sc.nextInt();

        // twoSum1(arr, n, tar);
        // twoSum2(arr, n, tar);
        twoSum3(arr, n, tar);

        sc.close();
    }

    static void twoSum1(int[] arr, int n, int tar){
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if (arr[i]+arr[j] == tar){
                    System.out.println("[" + i + ","+ j + "]");
                    return;
                }
            }
        }
        System.out.println("No Pair found.");
    }

    static void twoSum2(int[] arr, int n, int tar){
        int[] idx = new int[n];
        for (int i=0; i<n; i++){
            idx[i] = i;
        }

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if(arr[idx[i]] > arr[idx[j]]){
                    int temp = idx[i];
                    idx[i] = idx[j];
                    idx[j] = temp;
                }
            }
        }

        int left = 0;
        int right = n-1;
        while (left<right){
            int sum = arr[idx[left]] + arr[idx[right]];

            if (sum == tar){
                System.out.println("["+idx[left]+","+idx[right]+"]");
                return;
            }

            if (sum<tar){
                left++;
            }

            else{
                right--;
            }
        }
        System.out.println("Pair Not Found.");
    }

    static void twoSum3(int[] arr, int n, int tar){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++){
            int required = tar - arr[i];
            if (map.containsKey(required)){
                System.out.println("["+ map.get(required) + ","+ i + "]");
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("Pair Not Dound.");
    }
}
