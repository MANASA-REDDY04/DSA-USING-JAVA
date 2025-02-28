package BinarySearch.OnAns;

public class AllocatePages {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int m = 2;
        System.out.println(allocatePages(arr,m));
    }
    public static int allocatePages(int[] arr,int m){
        int n = arr.length;
        if(m > n ) return -1;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : arr){
            maxi = Math.max(maxi,i);
            sum += i;
        }
        int low = maxi;
        int high = sum;
        int ans = -1;
        while (low <= high){
            int mid = (low+high)/2;
            int countStudents = isValid(arr,mid,m);
            if(countStudents > m){
                low = mid+1;
            }else high = mid - 1;
        }
        return low;
    }
    public static int isValid(int[] arr,int mid,int m){
        int sum = 0;
        int c = 1;
        for(int i : arr){
            if(sum + i > mid){
                c++;
                sum = i;
            }else sum+=i;
        }
        return c;
    }
}
