package Arrays_Easy;

import java.util.Arrays;

public class LeftRotation {
    public static void main(String[] args) {
        int[] arr = {10,23,45,6,7,9,11,15};
        int n = arr.length;
        int k = 3;
//        leftRotation(arr,n,k);
        rightRotation(arr,n,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void rightRotation(int[] arr,int n, int k){
        rev(arr,0,n-k-1);
        rev(arr,n-k,n-1);
        rev(arr,0,n-1);
    }
    public static void leftRotation(int[] arr,int n,int k){
        rev(arr,0,k-1);
        rev(arr,k,n-1);
        rev(arr,0,n-1);
    }
    public static void rev(int[] arr,int s,int e){
        while (s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
