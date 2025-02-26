package Arrays_Hard;

import java.util.Arrays;

public class CountInversions {
    public static int count = 0;
    public static void main(String[] args) {
        int[] arr  = {5,3,2,1,4};
        int n = arr.length;
        count = 0;
        sort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(count);

    }
    public static void sort(int[] arr,int low,int high){
        if (low < high){
            int mid = (low+high)/2;
            sort(arr,low,mid);
            sort(arr,mid+1,high);
            count += merge(arr,low,mid,high);
        }
    }
    public static int merge(int[] arr,int low,int mid,int high){
        count = 0;
        int[] b = new int[high-low+1];
        int k = 0;
        int i = low;
        int j = mid+1;
        while (i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                b[k] = arr[i];
                i++; k++;
            }
            else{
                b[k] = arr[j];
                k++; j++;
                count += (mid - i + 1);
            }
        }
        while (i <= mid){
            b[k] = arr[i];
            i++; k++;
        }
        while (j <= high){
            b[k] = arr[j];
            k++; j++;
        }
        for(int p = 0; p < k; p++){
            arr[p+low] = b[p];
        }
        return count;
    }
}
