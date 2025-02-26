package Arrays_Hard;

public class MajorityElement3Times {
    public static void main(String[] args) {
        int[] arr = {11,33,33,11,33,11};
        int n = arr.length;
        int c1 = 0;
        int c2 = 0;
        int ele1 = 0;
        int ele2 = 0;
        for(int i = 0; i < n; i++){
            if(c1 == 0 && arr[i] != ele2){
                ele1 = arr[i];
                c1 = 1;
            }
            else if(c2 == 0 && arr[i] != ele1){
                ele2 = arr[i];
                c2 = 1;
            }
            else if(ele1 == arr[i]) c1++;
            else if(ele2 == arr[i]) c2++;
            else{
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int i = 0; i < n; i++){
            if(ele1 == arr[i]) c1++;
            else if(ele2 == arr[i]) c2++;
        }
        int val = (int) (n/3)+1;
        if(c1 >= val) System.out.println(ele1);
        if(c2 >= val) System.out.println(ele2);

    }
}
