package BinarySearch.On1D;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,12,22,78,99};
        int n = arr.length;
        System.out.println(bs(arr,n,78));
        System.out.println(bs(arr,n,100));
        System.out.println(bsRec(arr,0,n-1,22));
        System.out.println(bsRec(arr,0,n-1,1));
    }
    public static int bs(int[] arr,int n,int target){
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
    public static int bsRec(int[] arr,int low,int high,int target){
        if(low > high) return -1;
        int mid = (low+high)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] < target) return bsRec(arr,mid+1,high,target);
        else return bsRec(arr,low,mid-1,target);
    }
}
