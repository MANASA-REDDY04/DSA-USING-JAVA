package BinarySearch.OnAns;

import java.util.Arrays;

public class AggresiveCows {
    public static void main(String[] args) {
        int[] arr = {0,3,4,7,10,9};
        int k = 4;
        System.out.println(aggrCows(arr,k));
    }
    public static int aggrCows(int[] arr,int k){
        int n = arr.length;
        if(k > n) return -1;
        Arrays.sort(arr);
        int limit = arr[n-1] - arr[0];
        int low = 1;
        int high = limit;
        int ans = 1;
        while (low <= high){
            int mid = (low+high)/2;
            if(isValid(arr,mid,k)){
                ans = mid;
                low = mid+1;
            }else high = mid-1;
        }
        return ans;
    }
    public static boolean isValid(int[] arr,int mid,int k){
        int last = arr[0];
        int n = arr.length;
        int c = 1;
        for(int i = 1; i < n; i++){
            int dis = arr[i] - last;
            if(dis >= mid) {
                c++;
                last = arr[i];
            }
        }
        return c >= k;
    }
}
