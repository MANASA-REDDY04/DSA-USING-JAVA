package Sortings;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[5];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int low,int high){
        if(low < high){
            int mid = (low+high)/2;
            sort(arr,low,mid);
            sort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
        return;
    }
    public static void merge(int[] arr,int low,int mid,int high){
        int i = low;
        int j = mid+1;
        int[] b = new int[high-low+1];
        int k = 0;
        while(i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                b[k] = arr[i];
                i++;k++;
            }
            else{
                b[k]  = arr[j];
                j++;k++;
            }
        }
        while(i <= mid){
            b[k] = arr[i];
            i++;k++;
        }
        while(j <= high){
            b[k] = arr[j];
            j++;k++;
        }
        for (k = 0, i = low; i <= high; i++, k++) {
            arr[i] = b[k];
        }

    }
}
