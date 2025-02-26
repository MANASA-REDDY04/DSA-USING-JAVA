package Arrays_Hard;

import java.util.Arrays;

public class CountReversePairs {
    static int count = 0;
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,1};
        int n = arr.length;
        count = 0;
        sort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
    public static void sort(int[] arr,int low,int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            count += countPairs(arr,low,mid,high);
            merge(arr, low, mid, high);
        }
    }
    public static int countPairs(int[] arr,int low,int mid,int high){
        int right = mid+1;
        count = 0;
        for(int i = low; i <= mid; i++){
            while (right <= high && arr[i] > 2 * arr[right]) right++;
            count += (right-(mid+1));
        }
        return count;
    }
    public static void merge(int[] arr,int low,int mid,int high){
        int[] b = new int[high-low+1];
        int k = 0;
        int i = low;
        int j = mid + 1;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                b[k] = arr[i];
                i++;
                k++;
            } else {
                b[k] = arr[j];
                k++;
                j++;
            }
        }
        while (i <= mid) {
            b[k] = arr[i];
            i++;
            k++;
        }
        while (j <= high) {
            b[k] = arr[j];
            k++;
            j++;
        }
        for (int p = 0; p < k; p++) {
            arr[p + low] = b[p];
        }
    }
}
