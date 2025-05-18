package StacksQueues.InfixPostfixPrefix;

import java.util.Stack;

public class PostfixToInfix {
//    preToIn -> traverse s from n-1 to 0 and con = (t1+t2)
    public static String posttoIn(String s){
        Stack<String> st = new Stack<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(Character.isLetterOrDigit(s.charAt(i))) st.push(s.charAt(i)+"");
            else{
                String t1 = st.pop();
                String t2 = st.pop();
                String con = '('+t2+s.charAt(i)+t1+')';
                st.push(con);
            }
        }
        return st.peek();
    }

    public static void main(String[] args) {
        System.out.println(posttoIn("ab*c+"));
    }
}
