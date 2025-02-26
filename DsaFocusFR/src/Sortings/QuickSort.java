package Sortings;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
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
            int pindex = partition(arr,low,high);
            sort(arr,low,pindex-1);
            sort(arr,pindex+1,high);
        }
        return;
    }
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[0];
        int i = low;
        int j = high;
        while (i<j){
            while (i <= high-1 && arr[i] <= pivot){
                i++;
            }
            while (j >= low+1 && arr[j] > pivot){
                j--;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        return j;
    }
}
