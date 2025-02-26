package Arrays_Medium;

import java.util.Arrays;

public class Sort012s {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while (mid <= high){
            if(arr[mid] == 0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1) mid++;
            else{
                swap(arr,mid,high);
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
