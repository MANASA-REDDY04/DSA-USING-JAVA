package StacksQueues.InfixPostfixPrefix;

import java.util.Stack;

public class PretoPost {
    public static String pretopo(String s){
        Stack<String> st = new Stack<>();
//        t1+t2+op
        int n = s.length();
        for(int i = n-1; i >= 0; i--){
            if(Character.isLetterOrDigit(s.charAt(i))) st.push(s.charAt(i)+"");
            else{
                String t1 = st.pop();
                String t2 = st.pop();
                String con = t1+t2+s.charAt(i);
                st.push(con);
            }
        }
        return st.peek();
    }

    public static void main(String[] args) {
        System.out.println(pretopo("*-A/BC-/AKL"));
    }
}
