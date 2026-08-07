package Arrays;
import java.util.Arrays;

public class Problems {
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,1};
        rev(arr,1,2);
        System.out.println(Arrays.toString(arr));

    }
    
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int max(int[] arr){
        int maxVal = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static void rev(int[] arr, int index1, int index2){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
