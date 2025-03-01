package Strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(words));
    }
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int n = strs.length;
        for(int i = 1; i < n; i++){
//            while(strs[i].indexOf(prefix) != 0) also works
            while (!strs[i].startsWith(prefix)){
//                prefix matches in beginning so it returns 0
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
