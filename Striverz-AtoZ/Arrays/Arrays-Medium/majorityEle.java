import java.util.*;

class majorityEle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int cand = 0;
        int count = 0;

        for (int x : arr){
            if (count == 0){
                cand = x;
            }
            if (x == cand){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println(cand);
        sc.close();
    }
}