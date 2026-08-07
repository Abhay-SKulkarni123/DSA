import java.util.*;

class ArrayReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        rev(arr, 0, n-1);
        System.out.print(Arrays.toString(arr));
        sc.close();
    }
    
    static void rev(int[] arr, int i, int j){
        if(i >= j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        rev(arr, i+1, j-1);
    }
}


// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         rev(arr, 0);
//         System.out.print(Arrays.toString(arr));
//     }
    
//     static void rev(int[] arr, int i){
//         int n = arr.length;
//         if(i >= n/2){
//             return;
//         }
//         int temp = arr[i];
//         arr[i] = arr[n-i-1];
//         arr[n-i-1] = temp;
        
//         rev(arr, i+1);
//     }
// }