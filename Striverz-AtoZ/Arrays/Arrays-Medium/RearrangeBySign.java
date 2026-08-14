import java.util.*;

class RearrangeBySign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] res = new int[n];

        int pos = 0;
        int neg = 1;

        for (int num : arr){
            if (num > 0){
                res[pos] = num;
                pos += 2;
            }
            else {
                res[neg] = num;
                neg += 2;
            }
        }
        System.out.println(Arrays.toString(res));
        sc.close();
    }
}