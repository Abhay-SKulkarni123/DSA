import java.util.*;

class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int tar = sc.nextInt();
        
        for(int i=0; i<n; i++){
            if (arr[i] == tar){
                System.out.println("Target found at Index : " + i);
                return;

            }
            sc.close();
        }
        System.out.println("Target Not Found");
    }
}