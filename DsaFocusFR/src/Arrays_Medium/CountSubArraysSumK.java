package Arrays_Medium;

import java.util.HashMap;

public class CountSubArraysSumK {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int n = arr.length;
        int k = 6;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count = 0;
        hm.put(0,1);
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            count += hm.getOrDefault(sum-k,0);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        System.out.println(count);
    }
}
