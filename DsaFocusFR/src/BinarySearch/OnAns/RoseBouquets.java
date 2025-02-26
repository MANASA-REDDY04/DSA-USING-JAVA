package BinarySearch.OnAns;

public class RoseBouquets {
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int m = 2;
        int k = 3;
        System.out.println(minDays(arr,3,2));
    }
    public static int minDays(int[] arr,int k,int m){
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i : arr){
            mini = Math.min(mini,i);
            maxi = Math.max(maxi,i);
        }
        int low = mini;
        int high = maxi;
        int ans = -1;
        while (low <= high){
            int mid = (low+high)/2;
            if(isValid(mid,arr,k,m)){
                ans = mid;
                high = mid-1;
            }else low = mid+1;
        }
        return ans;
    }
    public static boolean isValid(int mid,int[] arr,int k,int m){
        int c = 0;
        int b = 0;
        for(int i : arr){
            if(i <= mid) c++;
            else{
                b += c/k;
                c = 0;
                if(b >= m) return true;
            }
        }
        b += c/k;
        return b>=m;
    }
}
