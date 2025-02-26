package Arrays_Medium;

public class StockBuySell {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int n = arr.length;
        int mini = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < n; i++){
            mini = Math.min(mini,arr[i]);
            profit = Math.max(profit,arr[i] - mini);
        }
        System.out.println(profit);
    }
}
