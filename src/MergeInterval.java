import java.util.Arrays;

import java.util.Comparator;
import java.util.LinkedList;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
        int[][] result = mergeIntervals(intervals);
        for(int[] ele : result) {
            System.out.println(Arrays.toString(ele));
        }
    }

    private static int[][] mergeIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        LinkedList<int[]> merge = new LinkedList<>();
        for (int[] interval : intervals) {
            if (merge.isEmpty() || merge.getLast()[1] < interval[0]) merge.add(interval);
            else merge.getLast()[1] = Math.max(merge.getLast()[1], interval[1]);
        }
        return merge.toArray(new int[merge.size()][]);
    }
}
