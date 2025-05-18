package StacksQueues.InfixPostfixPrefix;

import java.util.Arrays;
import java.util.Stack;

public class InfixToPrefix {
    public static int priority(char x){
        if(x == '^') return 3;
        else if(x == '/' || x == '*') return 2;
        else if(x == '-' || x == '+') return 1;
        else return -1;
    }

    public static void rev(char[] arr){
        int s = 0;
        int e = arr.length-1;
        while (s < e){
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static String inToPre(String s) {
        char[] arr = s.toCharArray();
        rev(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') arr[i] = ')';
            else if (arr[i] == ')') arr[i] = '(';
        }
        int i = 0;
        int n = arr.length;
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        while (i < n) {
            if (Character.isLetterOrDigit(arr[i])) {
                ans.append(arr[i]);
            } else if (arr[i] == '(') st.push(arr[i]);
            else if (arr[i] == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                if (!st.isEmpty()) st.pop();
            } else {
                if (arr[i] == '^') {
                    while (!st.isEmpty() && priority(arr[i]) <= priority(st.peek())) ans.append(st.pop());
                } else {
                    while (!st.isEmpty() && priority(arr[i]) < priority(st.peek())) ans.append(st.pop());
                }
                st.push(arr[i]);
            }
            i++;
        }
        while (!st.isEmpty()) ans.append(st.pop());
        char[] temp = ans.toString().toCharArray();
        rev(temp);
        return new String(temp);
    }

    public static void main(String[] args) {
        System.out.println(inToPre("a+b*(c^d-e)^(f+g*h)-i"));
    }
}
