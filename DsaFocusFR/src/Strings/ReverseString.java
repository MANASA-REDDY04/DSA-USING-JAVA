package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        int n = words.length;
        for(int i = n-1; i >= 0; i--){
            if(!words[i].contains(" ")){
                res.append(words[i]);
                res.append(" ");
            }
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}
