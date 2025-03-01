package Strings;

public class RemoveOuterParantheses {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }
    public static String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        char[] arr = s.toCharArray();
        int depth = 0;
        for(char i : arr){
            if(depth > 0 && i == '(') res.append(i);
            else if(depth > 1 && i == ')') res.append(i);
            if(i == '(') depth++;
            else depth--;
        }
        return res+"";
    }
}
