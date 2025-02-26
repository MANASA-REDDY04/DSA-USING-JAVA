package Arrays_Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {4,3,3,4,4,2,1,2,1,1};
        int target = 9;
        int n = arr.length;
        findSum(arr,n,target);
        find4Sum(arr,n,target);
    }
    public static void findSum(int[] arr,int n,int target){
        HashSet<List<Integer>> ans = new HashSet<>();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                HashSet<Integer> hs = new HashSet<>();
                for (int k = j +1; k < n; k++){
                    int fourth = target - (arr[i]+arr[j]+arr[k]);
                    if(hs.contains(fourth)){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(fourth);
                        temp.sort(null);
                        ans.add(temp);
                    }
                    hs.add(arr[k]);
                }
            }
        }
        System.out.println(ans);
    }
    public static void find4Sum(int[] arr, int n,int target){
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(i != 0 && arr[i] == arr[i-1]) continue;
            for(int j = i+1; j < n; j++){
                if(j != i+1 && arr[j] == arr[j-1]) continue;
                int k = j+1;
                int l = n-1;
                while (k < l){
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];
                    if(sum < target) k++;
                    else if (sum > target) l--;
                    else{
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while (k < l && arr[k] == arr[k-1]) k++;
                        while (k < l && arr[l] == arr[l+1]) l--;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
