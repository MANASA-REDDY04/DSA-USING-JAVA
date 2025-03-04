package Strings;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int left = 0;
        int right = 0;
        while (right < n){
            if(left != right && s.charAt(left) == s.charAt(right)){
                left++;
                continue;
            }
            ans = Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}
