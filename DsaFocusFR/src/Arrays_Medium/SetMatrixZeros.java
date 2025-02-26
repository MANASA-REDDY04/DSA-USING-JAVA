package Arrays_Medium;

import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        int n = 3;
        int m = 3;
        int col0 = -1;
        for(int i = 0; i < n; i++){
            for(int j =  0; j < m; j++){
                if(arr[i][j] == 0){
//                    mark row
                    arr[i][0] = 0;
//                    mark col
                    if(j == 0) col0 = 0;
                    else arr[0][j] = 0;
                }
            }
        }
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(arr[i][j] != 0){
                    if(arr[i][0] == 0 || arr[0][j] == 0) arr[i][j] = 0;
                }
            }
        }
        if(arr[0][0] == 0){
            for(int i = 0; i < m; i++)
                arr[0][i] = 0;
        }
        if(col0 == 0){
            for(int i = 0; i < n; i++)
                arr[i][0] = 0;
        }
        for(int i = 0; i < n; i++)
         System.out.println(Arrays.toString(arr[i]));
    }
}
