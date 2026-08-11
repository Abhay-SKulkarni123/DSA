import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        List<Integer> result = new ArrayList<>();
        
        int top = 0;
        int bottom = arr.length;
        int left = 0;
        int right = arr[0].length;
        
        while (top<=bottom && left<=right){
            // Left → Right
            for (int j = left; j <= right; j++) {
                result.add(arr[top][j]);
            }
            top++;

            // Top → Bottom
            for (int i = top; i <= bottom; i++) {
                result.add(arr[i][right]);
            }
            right--;

            // Right → Left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(arr[bottom][j]);
                }
                bottom--;
            }

            // Bottom → Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(arr[i][left]);
                }
                left++;
            }
        }
        
        // Print
        for (int num : result) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}