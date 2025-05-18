package StacksQueues.MonotonicStk;
import java.util.Arrays;
import java.util.Stack;
public class NextGreater2 {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        Stack<Integer> st = new Stack<>();
        for(int i = 2*n-1; i >= 0; i--){
            if(st.isEmpty()) ans[i] = -1;
            else{
                while(!st.isEmpty() && st.peek() <= nums[i%n]) st.pop();
                if(!st.isEmpty()) ans[i] = st.peek();
                else ans[i] = -1;
            }
            st.push(nums[i%n]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
}
