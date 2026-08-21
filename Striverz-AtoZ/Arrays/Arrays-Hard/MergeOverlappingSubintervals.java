import java.util.*;

public class MergeOverlappingSubintervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of intervals: ");
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        System.out.println("Enter intervals:");

        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (result.isEmpty() ||
                result.get(result.size() - 1)[1] < start) {
                result.add(new int[]{start, end});
            } else {
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], end);
            }
        }
        System.out.println("Merged intervals:");
        for (int[] interval : result) {
            System.out.println( "[" + interval[0] + ", " + interval[1] + "]" );
        }
        sc.close();
    }
}
