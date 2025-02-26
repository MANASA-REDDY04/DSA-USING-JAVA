package Arrays_Medium;

public class Kadnaes {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        int sum = 0;
        int maxi = 0;
        int ansSt = 0, ansEnd = 0;
        int start = 0;
        for(int i = 0; i < n; i++){
            if(sum == 0){
                start = i;
            }
            sum += arr[i];
            if(sum > maxi){
                maxi = sum;
                ansSt = start;
                ansEnd = i;
            }
            else if (sum < 0){
                sum = 0;
            }
        }
        System.out.println(ansSt+" "+ansEnd);
        System.out.println(maxi);
    }
}
