package Arrays_Easy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int n = arr.length;
        removeDuplicates(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void removeDuplicates(int[] arr,int n){
        int i = 0;
        for(int j = 1; j < n; j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
    }
}
