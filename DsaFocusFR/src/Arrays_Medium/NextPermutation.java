package Arrays_Medium;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        int n = arr.length;
        int index = -1;
        for(int i = n-2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }
        System.out.println(index);
        if(index == -1) {
            rev(arr, 0, n - 1);
        }
        else {
            for (int i = n - 1; i > index; i--) {
                if (arr[i] > arr[index]) {
                    int temp = arr[index];
                    arr[index] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
            rev(arr, index + 1, n - 1);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void rev(int[] arr,int s,int e){
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
