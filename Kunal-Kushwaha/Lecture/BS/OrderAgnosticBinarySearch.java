package BS;

public class OrderAgnosticBinarySearch {
    public static void main (String[] args) {
        int[] arr = {2,4,6,8,10,14,18};
        int target = 10;
        int ans = oaBinarySearch(arr,target);
        System.out.println(ans);
    }

    static int oaBinarySearch (int[] arr, int target) {
        int start = 0 ;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]){
                    end = mid - 1;
                }
                else if (target > arr[mid]){
                    start = mid + 1;
                }
                else {
                    if (target > arr[mid]){
                        end = mid - 1;
                    }
                    else if (target < arr[mid]){
                        start = mid + 1;
                    }
                }
            }
        }
        return -1;
    }


}
