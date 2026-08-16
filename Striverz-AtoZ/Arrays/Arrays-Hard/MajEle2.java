import java.util.*;

public class MajEle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        List<Integer> res = new ArrayList<>();

        int candidate1 = 0;
        int candidate2 = 0;
        int count1 = 0;
        int count2 = 0;

        // Find candidates
        for (int x : arr) {

            if (x == candidate1) {
                count1++;
            }
            else if (x == candidate2) {
                count2++;
            }
            else if (count1 == 0) {
                candidate1 = x;
                count1 = 1;
            }
            else if (count2 == 0) {
                candidate2 = x;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Reset counts for verification
        count1 = 0;
        count2 = 0;

        // Count actual occurrences
        for (int x : arr) {

            if (x == candidate1) {
                count1++;
            }

            if (x == candidate2) {
                count2++;
            }
        }

        // Check if candidates occur more than n/3 times
        if (count1 > n / 3) {
            res.add(candidate1);
        }

        if (count2 > n / 3 && candidate1 != candidate2) {
            res.add(candidate2);
        }

        System.out.println(res);
        sc.close();
    }
}
