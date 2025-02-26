package BinarySearch.On1D;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        int n = arr.length;
        int x = 9;
        System.out.println(lb(arr,n,x));
    }
//    ub -> arr[mid] > x
    public static int lb(int[] arr,int n, int x){
        int low = 0;
        int high = n-1;
        int ans = n;
        while (low <= high){
            int mid = (low+high)/2;
            if(arr[mid] >= x){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}
