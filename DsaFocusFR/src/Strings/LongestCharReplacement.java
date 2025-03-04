package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestCharReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s,k));
    }
    public static int characterReplacement(String s, int k) {
        int[] hash = new int[26];
        int maxOcc = 0;
        int left = 0;
        int right = 0;
        int ans = 0;
        int n = s.length();
        while (right < n){
            maxOcc = Math.max(maxOcc,++hash[s.charAt(right)-'A']);
            int len = right-left+1;
            if(len - maxOcc > k){
                hash[s.charAt(left)-'A']--;
                left++;
            }
            ans = Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}
