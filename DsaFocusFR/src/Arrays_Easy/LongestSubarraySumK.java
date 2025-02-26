package Arrays_Easy;

import java.util.HashMap;

public class LongestSubarraySumK {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,9};
        int n = 5;
        int k = 10;
//        BRUTE FORCE
//        int maxLen = 0;
//        int len = 0;
//        for(int i = 0; i < arr.length; i++){
//            int sum = 0;
//            for(int j = i; j < arr.length; j++){
//                sum += arr[j];
//                if(sum == k) len = j-i+1;
//            }
//            maxLen = Math.max(maxLen,len);
//        }
//        System.out.println(maxLen);
        System.out.println(LongestLen(arr,n,k));
        System.out.println(LongestPositives(arr,n,k));

    }
    public static int LongestLen(int[] arr,int n,int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        for(int i = 0; i < n;i++){
            sum += arr[i];
            if(sum == k) maxLen = i+1;
            else if(!hm.containsKey(sum)) hm.put(sum,i);
            else if(hm.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - hm.get(sum-k));
            }
        }
        return maxLen;
    }
    public static int LongestPositives(int[] arr,int n,int k){
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int len = 0;
        while (right < n){
            while (sum > k && left <= right){
                sum-=arr[left];
                left++;
            }
            if(sum == k) len = Math.max(len,right-left+1);
            right++;
            if(right < n) sum += arr[right];
        }
        return len;
    }
}
