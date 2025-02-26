package BinarySearch.On1D;

public class SearchEleInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int n = arr.length;
        int k = 0;
        System.out.println(find(arr,n,k));
        int[] arr2 = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int x = 8;
        int n2 = arr2.length;
        System.out.println(find2(arr2,n2,x));
    }
    public static int find(int[] arr,int n,int k){
        int low = 0;
        int high = n-1;
        while (low<= high){
            int mid = (low + high)/2;
            if(arr[mid] == k) return mid;
//            left sorted
            if(arr[low] <= arr[mid]){
                if(k >= arr[low] && k <= arr[mid]) high = mid-1;
                else low = mid+1;
            }
            else if(arr[mid] <= arr[high]){
                if(k >= arr[mid] && k <= arr[high]) low = mid+1;
                else high = mid-1;
            }
        }
        return -1;
    }
    public static boolean find2(int[] arr,int n,int k){
        int low = 0;
        int high = n-1;
        while (low<= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) return true;
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low++;
                high--;
                continue;
            }
//            left sorted
            if(arr[low] <= arr[mid]){
                if(k >= arr[low] && k <= arr[mid]) high = mid-1;
                else low = mid+1;
            }
            else if(arr[mid] <= arr[high]){
                if(k >= arr[mid] && k <= arr[high]) low = mid+1;
                else high = mid-1;
            }
        }
        return false;
    }
}
