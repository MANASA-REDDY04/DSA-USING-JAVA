package Arrays_Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        int n = arr.length;
        findSum(arr,n);
        find3Sum(arr,n);
    }

    public static void findSum(int[] arr,int n){
        HashSet<List<Integer>> ans = new HashSet<>();
        for(int i = 0; i < n; i++) {
            HashSet<Integer> hs = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(arr[i] + arr[j]);
                if (hs.contains(third)) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(third);
                    temp.sort(null);
                    ans.add(temp);
                }
                hs.add(arr[j]);
            }
        }
        System.out.println(ans);
    }
    public static void find3Sum(int[] arr,int n){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(i != 0 && arr[i] == arr[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while (j < k){
                sum = arr[i] + arr[j] + arr[k];
                if(sum < 0) j++;
                else if(sum > 0) k--;
                else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    ans.add(temp);
                    j++; k--;
                    while (j < k && arr[j] == arr[j-1]) j++;
                    while (j < k && arr[k] == arr[k+1]) k--;
                }
            }
        }
        System.out.println(ans);
    }
}
