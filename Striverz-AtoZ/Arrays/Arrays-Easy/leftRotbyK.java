import java.util.*;

public class leftRotbyK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        k = k % n;

        rev(arr, 0, k-1);
        rev(arr, k, n-1);
        rev(arr, 0, n-1);

        for (int x : arr){
            System.out.print(x + " ");
        }
        sc.close();
    }

    public static void rev(int[] arr, int i, int j){
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

// public class leftRotbyK {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         for (int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         int k = sc.nextInt();
//         k = k % n;

//         for (int i=0; i<k; i++){
//             int first = arr[0];

//             for (int j=1; j<n; j++){
//                 arr[j-1] = arr[j];
//             }
//             arr[n-1] = first;
//         }

//         for (int x : arr){
//             System.out.print(x + " ");
//         }
//         sc.close();
//     }
// }
