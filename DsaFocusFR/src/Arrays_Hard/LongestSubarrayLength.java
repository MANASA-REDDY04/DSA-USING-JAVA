package Arrays_Hard;

import java.util.HashMap;

public class LongestSubarrayLength {
    public static void main(String[] args) {
        int[] arr = {9, -3, 3, -1, 6, -5};
        int n = arr.length;
        countSubarrayLength(arr,n);
    }
    public static void countSubarrayLength(int[] arr,int n){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        hm.put(0,1);
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum == 0) maxLen = i+1;
            else{
                if(hm.containsKey(sum)) maxLen = Math.max(maxLen,i-hm.get(sum));
                if(!hm.containsKey(sum)) hm.put(sum,i);
            }
        }
        System.out.println(maxLen);
    }
}
