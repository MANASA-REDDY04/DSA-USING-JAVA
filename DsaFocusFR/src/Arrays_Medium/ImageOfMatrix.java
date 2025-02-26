package Arrays_Medium;

import java.util.Arrays;

public class ImageOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        int m = arr[0].length;
//        Transpose
        for(int i = 0; i <= n-2; i++){
            for(int j = i+1; j <= m-1; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int[] row : arr) {
            rev(row, 0, m - 1);
        }
        for (int[] row: arr) System.out.println(Arrays.toString(row));
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
