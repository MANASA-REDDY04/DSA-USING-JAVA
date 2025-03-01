package BinarySearch.OnAns;
//find minimum bananas it can eat oer hr
public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] arr = {7,15,6,3};
        int h = 8;
        System.out.println(minK(arr,h));
    }
    public static int minK(int[] arr,int h){
        int low = 1;
        int high = h;
        int ans = -1;
        while (low <= high){
            int mid = (low+high)/2;
            if(isValid(mid,h,arr)){
                ans = mid;
                high = mid-1;
            }else low = mid+1;
        }
        return ans;
    }
    public static boolean isValid(int mid,int h,int[] arr){
        int k = 0;
        for (int i : arr){
            k += (int)Math.ceil((double) i /mid);
            if(k > h) return false;
        }
        return k <= h;
    }
}
