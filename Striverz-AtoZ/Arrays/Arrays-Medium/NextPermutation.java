import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int i = n - 2;

        while (i >= 0 && arr[i] >= arr[i+1]){
            i--;
        }

        if (i >= 0){
            int j = arr.length - 1;

            while (arr[j] <= arr[i]){
                j--;
            }
            swap(arr, i, j);
        }

        int left = i + 1;
        int right = n - 1;
        while (left < right){
            swap(arr, left, right);
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();

    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
