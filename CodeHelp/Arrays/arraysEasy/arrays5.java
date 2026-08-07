package Arrays.arraysEasy;
import java.util.*;

public class arrays5 {
    static void shift1(int[] arr){
        int temp = arr[arr.length - 1];
        for (int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        for (int x : arr){
            System.out.print(x + " ");
        }
    }   
    
    static void shiftK(int[] arr){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        k = k % arr.length;

        for (int i = 0; i<k; i++){
            int temp = arr[arr.length - 1];

            for (int j=arr.length-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }

        for (int x : arr){
            System.out.print(x + " ");
        }
        sc.close();
    }

    static void highLow(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : arr){
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE;
        int maxEle = arr[0];

        int minFreq = Integer.MAX_VALUE;
        int minEle = arr[0];

        for (int key : freq.keySet()){
            if (freq.get(key) > maxFreq){
                maxFreq = freq.get(key);
                maxEle = key;
            }

            if (freq.get(key) < minFreq){
                minFreq = freq.get(key);
                minEle = key;
            }
        }
        System.out.println("Highest Frequency : " + maxEle + " -> " + maxFreq);
        System.out.println("Lowest Frequency Element : " + minEle + " -> " + minFreq);
    }

    static void arrayFreq(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int i : freq.keySet()) {
            System.out.println(i + " -> " + freq.get(i));
        }
    }

    static void modeArray(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int mode = arr[0];
        int maxCount = 0;

        for (int key : freq.keySet()){
            if (freq.get(key) > maxCount){
                maxCount = freq.get(key);
                mode = key;
            }
        }

        System.out.println("Mode : " + mode);
        System.out.println("Frequency : " + maxCount);
    }

    static void arrayUnion(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr1){
            set.add(x);
        }

        for (int x : arr2){
            set.add(x);
        }

        for (int x : set){
            System.out.print(x + " ");
        }
        sc.close();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // shift1(arr);
        // shiftK(arr);
        // arrayUnion();
        // arrayFreq(arr);
        // modeArray(arr);
        highLow(arr);

        sc.close();
    }
}
