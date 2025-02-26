package Arrays_Easy;

public class Is_Sorted {
    public static void main(String[] args) {
//        int[] arr = {5, 9, 10, 2, 1};
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.println(isSorted(arr,n));

    }
    public static boolean isSorted(int[] arr,int n){
        for(int i = 1; i < n; i++){
            if(arr[i-1] > arr[i]) return false;
        }
        return true;
    }
}
