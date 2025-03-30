package ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlapIntervals {

    public static void brute(int[][] arr) {
        // Convert 2D array to List
        List<int[]> list = new ArrayList<>(Arrays.asList(arr));
        List<int[]> result= new ArrayList<>();
        // Sort based on the first element; if equal, sort based on the second element
        list.sort((a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);  // Sort by first element
            } else {
                return Integer.compare(a[1], b[1]);  // If first elements are equal, sort by second element
            }
        });
       // adding array ;
        result.add(list.get(0));
        for(int i = 0 ; i < list.size();i++){
            int[] prev = result.get(result.size() - 1);
            int[] curr = list.get(i);

            if (curr[0] <= prev[1]) {
                // Overlapping intervals, merge them
                prev[1] = Math.max(prev[1], curr[1]);
            } else {
                // No overlap, add new interval to result
                result.add(curr);
            }
        }
        for (int[] ar:result) {
            System.out.println(Arrays.toString(ar));
        }
    }

    public static void main(String[] args) {
        //Arrays of intervals
        //merge the overlapping intervals
     int[][] arr = {{1,3},{2,6},{8,9},{9,11},{8,10},{2,4},{15,18},{16,17}};
     brute(arr);
    }
}
