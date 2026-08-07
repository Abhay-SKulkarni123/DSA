package Arrays.arraysEasy;
import java.util.*;

public class arrays4 {
    static void count01(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        for (int x : arr){
            if (x == 0){
                count0++;
            }
            else if (x == 1){
                count1++;
            }
        }    
        System.out.println("Number of 0s in Array : " + count0);
        System.out.println("Number of 1s in Array : " + count1);    
    }

    static void firstUnsorted (int[] arr) {
        for (int i=0; i<arr.length - 1; i++){
            if (arr[i] > arr[i+1]){
                System.out.println("The Index of First Unsorted Element in Array : " + (i+1));
                System.out.println("The First Unsorted Element in Array : " + arr[i+1]);
                return;
            }
        }
        System.out.println("The Array is Sorted.");
    }

    static void arrayIntersection (){
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

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
        sc.close();
    }

    static void altExtreme(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j){
            if (i == j){
                System.out.println(arr[i]);
                return;
            }
            else {
                System.out.print(arr[i] + " ");
                i++;
                System.out.print(arr[j] + " ");
                j--;
            }
        }
    }

    static void reverseArray(int[] arr) {
        int i =0;
        int j = arr.length - 1;
        while (i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int x : arr){
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // count01(arr);
        // firstUnsorted (arr);
        // arrayIntersection();
        // altExtreme(arr);
        reverseArray(arr);

        sc.close();
    }
}
