package Arrays_Easy;

public class Second_Largest {
    public static void main(String[] args) {
        int[] arr = {5, 9, 10, 2, 1};
        int maxi = arr[0];
        int sec_Maxi = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxi){
                sec_Maxi = maxi;
                maxi = arr[i];
            }
            else if(arr[i] > sec_Maxi && arr[i] != maxi){
                sec_Maxi = arr[i];
            }
        }
        System.out.println(sec_Maxi);
    }
}
