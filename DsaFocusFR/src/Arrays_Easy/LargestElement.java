package Arrays_Easy;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {5, 9, 10, 2, 1};
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            maxi = Math.max(maxi,arr[i]);
        }
        System.out.println(maxi);
    }
}
