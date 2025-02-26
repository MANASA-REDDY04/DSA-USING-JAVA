package BinarySearch.On1D;

public class FloorCeil {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int n = arr.length;
        int x = 5;
        System.out.println(floor(arr,n,x));
    }
    public static int floor(int[] arr,int n,int x){
        int low = 0;
        int high = n-1;
        int ans = 0;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid] <= x){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}
