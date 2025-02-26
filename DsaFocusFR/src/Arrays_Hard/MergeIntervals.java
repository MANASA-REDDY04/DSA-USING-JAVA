package Arrays_Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int n = intervals.length;
        int m = intervals[0].length;
        merge(intervals,n,m);
        mergeOptimal(intervals,n,m);
    }
    public static void merge(int[][] arr,int n,int m){
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(!ans.isEmpty() && arr[i][1] <= ans.getLast().get(1)) continue;
            int start = arr[i][0];
            int end = arr[i][1];
            for(int j = i+1; j < n; j++){
                if(arr[j][0] <= end){
                    end = Math.max(end,arr[j][1]);
                }else{
                    break;
                }
            }
            List<Integer> temp = new ArrayList<>();
            temp.add(start);
            temp.add(end);
            ans.add(temp);
        }
        System.out.println(ans);
    }
    public static void mergeOptimal(int[][] arr,int n,int m){
        int s = arr[0][0];
        int e = arr[0][1];
        List<int[]> li = new ArrayList<>();
        for(int i = 1; i < n; i++){
            if(arr[i][0] <= e){
                e = Math.max(arr[i][1],e);
            }else{
                li.add(new int[]{s,e});
                s = arr[i][0];
                e = arr[i][1];
            }
        }
        li.add(new int[]{s,e});
        for (int[] ints : li) {
            System.out.print(Arrays.toString(ints));
        }
    }
}
