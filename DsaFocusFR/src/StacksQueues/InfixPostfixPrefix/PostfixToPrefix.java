package StacksQueues.InfixPostfixPrefix;

import java.util.Stack;

public class PostfixToPrefix {
//    opr t2 t1
    public static String potoIn(String s){
        Stack<String> st = new Stack<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(Character.isLetterOrDigit(s.charAt(i))) st.push(s.charAt(i)+"");
            else{
                String t1 = st.pop();
                String t2 = st.pop();
                String con = s.charAt(i)+t2+t1;
                st.push(con);
            }
        }
        return st.peek();
    }

    public static void main(String[] args) {
        System.out.println(potoIn("ABC/-AK/L-*"));
    }
}
