package Arrays_Medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int n = arr.length;
        int target = 14;
//        VAR1 yes/no
//        boolean ans = var1(arr,n,target);
//        System.out.println(ans);
//        VAR2 {INDICES}
        System.out.println(Arrays.toString(var2(arr, n, target)));
    }
    public static boolean var1(int[] arr,int n,int target){
        Arrays.sort(arr);
        int sum = 0;
        int left = 0;
        int right = n-1;
        while (left < right){
            sum = arr[left] + arr[right];
            if(sum == target) return true;
            else if(sum > target) right--;
            else left++;
        }
        return false;
    }
    public static int[] var2(int[] arr,int n,int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(hm.containsKey(target - arr[i])) return new int[]{hm.get(target-arr[i]),i};
            else if(!hm.containsKey(arr[i])) hm.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}
