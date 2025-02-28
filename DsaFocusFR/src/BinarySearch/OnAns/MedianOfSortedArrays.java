package BinarySearch.OnAns;

public class MedianOfSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6};
        int[] arr2 = {1,3};
        System.out.println(findMedian(arr1,arr2,arr1.length,arr2.length));
    }
    public static double findMedian(int[] arr1,int[] arr2,int n1, int n2){
        if(n1 > n2) return findMedian(arr2,arr1,n2,n1);
        int n = n1+n2;
        int low = 0;
        int high = n1;
        int onLeft = (n1+n2+1)/2;
        while (low <= high){
//            mid formula
            int mid1 = (low + high) >> 1;
            int mid2 = onLeft - mid1;
            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;
            if(mid1 < n1) r1 = arr1[mid1];
            if(mid2 < n2) r2 = arr2[mid2];
            if(mid1-1 >= 0) l1 = arr1[mid1-1];
            if(mid2 - 1 >= 0) l2 = arr2[mid2-1];
            if(l1 <= r2 && l2 <= r1){
                if(n % 2 == 1){
                    return Math.max(l1,l2);
                }
                else{
                    return ((Math.max(l1,l2) + Math.min(r1,r2))/2.0);
                }
            }
            else if(l1 > r2) high = mid1-1;
            else low = mid1+1;
        }
        return 0;
    }
}
