package BinarySearch.OnAns;

public class CapacityToShipInDDays {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int d = 10;
        System.out.println(shipWithinDays(weights,d));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : weights){
            maxi = Math.max(maxi,i);
            sum += i;
        }
        int low = maxi;
        int high = sum;
        int ans = -1;
        while (low <= high){
            int mid = (low+high)/2;
            if(isValid(mid,weights,days)){
                ans = mid;
                high = mid-1;
            }else low = mid+1;
        }
        return ans;
    }
    public static boolean isValid(int mid,int[] arr,int days){
        int sum = 0;
        int c = 0;
        for(int i : arr){
            sum += i;
            if(sum >= mid){
                c += Math.floorDivExact(sum,mid);
                if(c > days) return false;
                sum = sum == mid? 0 : i;
            }

        }
        if(sum != 0) c+=1;
        return c <= days;
    }
}
