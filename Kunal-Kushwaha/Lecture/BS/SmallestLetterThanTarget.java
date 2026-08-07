package BS;
import java.util.*;

class SmallestLetterThanTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Character Array : ");
        int n = sc.nextInt();
        char[] letters = new char[n];
        System.out.print("Enter the Sorted Character Array : ");
        for (int i = 0; i < n; i++) {
            letters[i] = sc.next().charAt(0);
        }
        System.out.print("Enter the Target Value : ");
        char target = sc.next().charAt(0);
        char result = smallest(letters, target);
        System.out.println("The Character Value is : " + result);
        sc.close();
    }

    static char smallest(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // wrap-around case
        return letters[start % letters.length];
    }
}