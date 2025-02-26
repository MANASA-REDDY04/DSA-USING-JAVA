package Arrays_Easy;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int n = arr.length;
        move(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void move(int[] arr,int n){
        int i = -1;
        for(int j = 0; j < n; j++){
            if(arr[j] == 0){
                i = j;
                break;
            }
        }
        if(i == -1) return;
        for(int j = i+1; j < n; j++){
            if(arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
    }
}
