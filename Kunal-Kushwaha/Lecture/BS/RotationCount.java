package BS;

class Main {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(countRotations(arr));   // 3
    }
    
    public static int countRotations(int[] arr){
        int pivot = findPivot(arr);
        return pivot + 1;
    }

     // FIND PIVOT (handles duplicates)
    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // case 1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // case 3: duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {

                // check start
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check end
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            // left side sorted → go right
            else if (arr[start] < arr[mid] ||
                    (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }
            // right side sorted → go left
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // SEARCH IN ROTATED ARRAY
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    // STANDARD BINARY SEARCH
    public static int binarySearch(int[] arr, int target,
                                   int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } 
            else if (target > arr[mid]) {
                start = mid + 1;
            } 
            else {
                return mid;
            }
        }
        return -1;
    }
}