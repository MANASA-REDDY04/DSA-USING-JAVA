package Arrays_Medium;

import java.util.HashSet;

public class ConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {3, 11, 5, 7, 6};
        int n = arr.length;
        System.out.println(find(arr,n));
    }
    public static int find(int[] arr,int n){
        int maxLen = 0;
        int count = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i: arr){
            hs.add(i);
        }
        for(int i = 0; i < n; i++){
            if(!hs.contains(arr[i]-1)){
                int x = arr[i];
                count = 1;
                while (hs.contains(x+1)){
                    x++;
                    count++;
                }
            }
            maxLen = Math.max(maxLen,count);
        }
        return maxLen;
    }
}
