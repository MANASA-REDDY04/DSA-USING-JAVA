package Arrays_Medium;

import java.util.ArrayList;
import java.util.List;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        int m = arr[0].length;
        List<Integer> ls = printSpiral(arr,n,m);
        System.out.println(ls);
    }
    public static List<Integer> printSpiral(int[][] arr,int n,int m){
        int top = 0,left = 0;
        int right = m-1;
        int bottom = n-1;
        List<Integer> ls = new ArrayList<>();
        while (top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                ls.add(arr[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++){
                ls.add(arr[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    ls.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for (int i = bottom; i >= top; i--){
                    ls.add(arr[i][left]);
                }
                left++;
            }
        }
        return ls;
    }
}
