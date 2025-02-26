package Arrays_Medium;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        int n = arr.length;
        leaders(arr,n);
    }
    public static void leaders(int[] arr,int n){
        List<Integer> ls = new ArrayList<>();
        int leader = arr[n-1];
        ls.add(leader);
        for(int i = n-2; i >= 0; i--){
            if(arr[i] > leader){
                leader = arr[i];
                ls.add(leader);
            }
        }
        System.out.println(ls);
    }
}
