package BinarySearch.OnAns;

public class SmallestDivisor {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int limit = 8;
        System.out.println(smallDivisor(arr,limit));
    }
    public static int smallDivisor(int[] arr,int limit){
        int low = 1;
        int high = limit;
        int ans = -1;
        while (low <= high){
            int mid = (low+high)/2;
            if(isValid(mid,arr,limit)){
                ans = mid;
                high = mid-1;
            }else low = mid+1;
        }
        return ans;
    }
    public static boolean isValid(int mid,int[] arr,int limit){
        int sum = 0;
        for(int i : arr){
            sum += (int)Math.ceil((double) i/mid);
            if(sum > limit) return false;
        }
        return sum <= limit;
    }
}
