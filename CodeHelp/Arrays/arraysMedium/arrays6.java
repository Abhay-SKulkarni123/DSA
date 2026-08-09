package Arrays.arraysMedium;
import java.util.*;

public class arrays6 {
    public static void sort01(int[] arr){
        int i = 0;
        int j = arr.length - 1;

        while (i < j){
            if (arr[i] == 1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;
            }
            else if (arr[i] == 0){
                i++;
            }
            else if (arr[j] == 1){
                j--;
            }
        }

        for (int x : arr){
            System.out.print(x + " ");
        }
    }

    public static void missingNum(int[] arr){
        int xor = 0;
        
        for (int i=0; i<=arr.length; i++){
            xor = xor ^ i;
        }
        for (int x : arr){
            xor = xor ^ x;
        }
        
        System.out.println("Missing Number  : " + xor);
    }

    public static void uniqueEle(int[] arr){
        int xor = 0;
        for (int x : arr){
            xor = xor ^ x;
        }
        
        System.out.println("Unique Element : " + xor);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // sort01(arr);
        // missingNum(arr);
        uniqueEle(arr);

        sc.close();
    }
}
