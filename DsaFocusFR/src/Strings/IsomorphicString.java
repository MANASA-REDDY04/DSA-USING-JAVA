package Strings;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        int n = s.length();
        HashMap<Character,Character> st = new HashMap<>();
        HashMap<Character,Character> ts = new HashMap<>();
        for(int i = 0; i < n; i++){
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            if(st.containsKey(sch) && st.get(sch) != tch) return false;
            if(ts.containsKey(tch) && ts.get(tch) != sch) return false;
            st.put(sch,tch);
            ts.put(tch,sch);
        }
        return true;
    }
}
