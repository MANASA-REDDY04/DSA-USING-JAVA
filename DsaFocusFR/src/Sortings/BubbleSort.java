package Sortings;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
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
        boolean didswap = false;
        for(int i = n-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didswap = true;
                }
            }
            if(!didswap) break;
        }
    }
}
