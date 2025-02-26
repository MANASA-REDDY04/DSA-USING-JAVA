package BinarySearch.On1D;

public class FindMinimumElement {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,-1,0,1,2,3};
        int n = arr.length;
        System.out.println(findMin(arr,n));
    }
    public static int findMin(int[] arr,int n){
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        while (low <= high){
            int mid = (low + high)/2;
            if(arr[low] <= arr[high]){
                ans = Math.min(ans,arr[low]);
                break;
            }
            if(arr[low] <= arr[mid]){
                ans = Math.min(ans,arr[low]);
                low = mid+1;
            }
            else if(arr[mid] <= arr[high]){
                ans = Math.min(ans,arr[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
}
