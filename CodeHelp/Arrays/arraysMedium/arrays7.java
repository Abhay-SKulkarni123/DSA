package Arrays.arraysMedium;
import java.util.*;

class arrays7 {
    public static void twoSum(int[] arr){
        Scanner sc = new Scanner(System.in);
        int tar = sc.nextInt();
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (arr[i]+arr[j] == tar){
                    int[] ans = {i,j};
                    System.out.println(Arrays.toString(ans));
                    return;
                }
            }
            sc.close();
        }
        System.out.println(-1);
    }

    public static void threeSum(int[] arr){
        int n = arr.length;
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
    }

    static void remDup(int[] arr){
        int n = arr.length;
        if (n < 1){
            System.out.println(Arrays.toString(arr));
            return;
        }

        int j = 1;
        for (int i=1; i<n; i++){
            if(arr[i] != arr[i-1]){
                arr[j] = arr[i];
                j++;
            }
        }
        System.out.println(j);
    }

    static void firstRepeat(int[] arr){
        int n = arr.length;

        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<n; i++){
            if(set.contains(arr[i])){
                System.out.print(arr[i]);
                return;
            }
            set.add(arr[i]);
        }
    }

    static void pivotIndex(int[] arr){
        int n = arr.length;
        int total = 0;
        for (int x : arr){
            total += x;
        }
        int left = 0;
        for (int i=0; i<n; i++){
            int right = total - left - arr[i];
            if (left == right){
                System.out.println(i);
                return;
            }
            left += arr[i];
        }
        System.out.println(-1);
    }

    static void kadaneSum(int[] arr){      
        int sum = 0;
        int max = Integer.MIN_VALUE;
        
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
            max = Math.max(max, sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);
    }

    static void kadaneProduct(int[] arr){      
        int max = arr[0];
        int min = arr[0];
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int x = arr[i];
            int oldMax = max;

            max = Math.max(x, Math.max(x * max, x * min));
            min = Math.min(x, Math.min(x * oldMax, x * min));

            ans = Math.max(ans, max);
        }
        System.out.println(ans);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // twoSum(arr);
        // threeSum(arr);
        // remDup(arr);
        // firstRepeat(arr);
        // pivotIndex(arr);
        // kadaneSum(arr);
        kadaneProduct(arr);

        sc.close();        
    }
}