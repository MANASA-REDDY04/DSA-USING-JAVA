package Arrays_Medium;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int n = arr.length;
        int count = 1;
        int ele = arr[0];
        for (int i = 1; i < n; i++){

            if(count == 0){
                ele = arr[i];
                count = 1;
            }
            else if(arr[i] == ele) count++;
            else count--;

        }
        System.out.println(ele);
    }
}
