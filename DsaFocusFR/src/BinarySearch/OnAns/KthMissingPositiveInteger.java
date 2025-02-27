package BinarySearch.OnAns;

public class KthMissingPositiveInteger {
    public static void main(String[] args) {
        int[] arr = {4,7,9,10};
        int k = 4;
        System.out.println(findMissing(arr,k));
    }
    public static int findMissing(int[] arr,int k){
        int low = 1;
        int n = arr.length;
        int high = n-1;
        int ans =-1;
        while (low <= high){
            int mid = (low+high)/2;
//            number of missing elements upto mid
            int count = arr[mid] - (mid+1);
            if(count < k) low = mid+1;
            else high = mid-1;
        }
//         low will be at exactly k element missing place
        return k + low;
    }
}
