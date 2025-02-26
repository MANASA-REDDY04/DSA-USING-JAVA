package Arrays_Easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int n = arr.length;
        int count = 0;
        int maxCount = 0;
        for(int i : arr){
            if(i == 1) count++;
            else count = 0;
            maxCount = Math.max(maxCount,count);
        }
        System.out.println(maxCount);
    }
}
