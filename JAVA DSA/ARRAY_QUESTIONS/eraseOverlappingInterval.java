package ARRAY_QUESTIONS;
import java.util.*;
public class eraseOverlappingInterval {
    public static void main(String[] args) {
        int[][] arr = {{1,100},{11,22},{1,11},{2,12}};
        eraseOverlapIntervals(arr);
    }   
    public static int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0 ||intervals == null){
            return 0;
        }

        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        int count = 0;
        for(int i = 1;i<intervals.length;i++){
            if(intervals[i][0] < end){
                // end = Math.max(end, intervals[i][1]);
                count++;
                continue;
            }else{
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        return count; 
    } 
}
