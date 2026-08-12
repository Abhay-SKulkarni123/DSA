import java.util.*;

public class kadaneProd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
        int ans = arr[0];

        for (int i=1; i<n; i++){
            int x = arr[i];
            int oldMax= max;

            max = Math.max(x, Math.max(x * max, x * min));
            min = Math.max(x, Math.max(x * oldMax, x * min));
            ans = Math.max(ans, max);
        }
        System.out.println(ans);
        sc.close();
    }
}
