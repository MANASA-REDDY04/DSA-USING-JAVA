package Sortings;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[5];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int n){
        for(int i = 1; i <= n-1; i++){
            int j = i-1;
            int ele = arr[i];
            while(j >= 0 && arr[j] > ele){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = ele;
        }
    }
}
