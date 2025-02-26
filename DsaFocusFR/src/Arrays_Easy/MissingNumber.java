package Arrays_Easy;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = 5;
        int ps = 0;
        for (int j : arr) {
            ps += j;
        }
        int sn = n*((n+1)/2);
        System.out.println(sn-ps);
        int pxor = 0;
        for(int i = 0; i < arr.length; i++){
            pxor ^= arr[i];
            pxor ^= (i+1);
        }
        pxor ^= n;
        System.out.println(pxor);
    }
}
