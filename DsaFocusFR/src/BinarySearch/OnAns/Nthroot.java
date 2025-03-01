package BinarySearch.OnAns;

public class Nthroot {
    public static void main(String[] args) {
        int n = 4;
        int m = 625;
        System.out.println(find(n,m));
    }
    public static int find(int n, int m){
        int low = 1;
        int high = m;
        while (low <= high){
            int mid = (low+high)/2;
            int val = midN(mid,n,m);
            if(val == 0) return mid;
            else if(val == 1) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
//    mid ^ n = m
    public static int midN(int mid,int n,int m){
        int ans = 1;
        for(int i = 1; i <= n; i++){
            ans = ans*mid;
            if(ans > m) return 2;
        }
        if(ans == m) return  0;
        else return 1;
    }
}
