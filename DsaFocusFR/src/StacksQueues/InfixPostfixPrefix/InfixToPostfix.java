package StacksQueues.InfixPostfixPrefix;

import java.util.Stack;

public class InfixToPostfix {
    public static int priority(char x){
        if(x == '^') return 3;
        else if(x == '/' || x == '*') return 2;
        else if(x == '-' || x == '+') return 1;
        else return -1;
    }
    public static String intopostfix(String s){
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int i = 0;
        Stack<Character> st = new Stack<>();
        while (i < n){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)) ans.append(ch);
            else if(ch == '('){
                st.push(ch);
            }
            else if(ch == ')'){
                while (!st.isEmpty() && st.peek() != '('){
                    ans.append(st.pop());
                }
                if(!st.isEmpty()) st.pop();
            }else{
                while (!st.isEmpty() && priority(ch) <= priority(st.peek())){
                    ans.append(st.pop());
                }
                st.push(ch);
            }
            i++;
        }
        while(!st.isEmpty()) ans.append(st.pop());
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(intopostfix("a+b*(c^d-e)^(f+g*h)-i"));
    }
}
