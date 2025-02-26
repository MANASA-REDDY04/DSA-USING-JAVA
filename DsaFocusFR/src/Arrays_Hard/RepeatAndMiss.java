package Arrays_Hard;

public class RepeatAndMiss {
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4,6,7,5};
        int n = arr.length;
        find(arr,n);
        findnum(arr,n);
    }
    public static void find(int[] arr,int n){
        int sn = n * (n+1)/2;
        int sn2 = n * (n+1) * (2 * n + 1)/6;
        int s = 0;
        int s2 = 0;
        for(int i = 0; i < n; i++){
            s += arr[i];
            s2 += (int) Math.pow(arr[i],2);
        }
        int val1 = s - sn;
        int val2 = s2 - sn2;
        int val3 = val2/val1;
        int a = (val3+val1)/2;
        int b = Math.abs(val1-a);
        System.out.println(a+" "+b);
    }
    public static void findnum(int[] arr,int n){
        int xr = 0;
        for(int i = 0; i < n; i++){
            xr ^= arr[i];
            xr ^= (i+1);
        }
        int bit = (xr & ~(xr-1));
        int ones = 0;
        int zeros = 0;
        for(int i = 0; i < n; i++){
            if((arr[i] & bit) != 0) ones ^= arr[i];
            else zeros ^= arr[i];

            if(((i+1) & bit) != 0) ones ^= (i+1);
            else zeros ^= (i+1);
        }
        for(int i : arr){
            if(i == ones){
                System.out.println("Repeat: "+ones+"Missing: "+zeros);
                return;
            }
        }
        System.out.println("Repeat: "+zeros+ "   " + "Missing: "+ones);
    }
}
