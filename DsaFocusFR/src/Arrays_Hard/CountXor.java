package Arrays_Hard;

import java.util.HashMap;

public class CountXor {
    public static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        int n = arr.length;
        int k = 6;
        countxor(arr,n,k);
    }
    public static void countxor(int[] arr,int n, int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int count = 0;
        int pxor = 0;
        for(int i = 0; i < n; i++){
            pxor ^= arr[i];
            int x = pxor ^ k;
            count += hm.getOrDefault(x,0);
            hm.put(pxor,hm.getOrDefault(pxor,0)+1);
        }
        System.out.println(count);
    }
}
