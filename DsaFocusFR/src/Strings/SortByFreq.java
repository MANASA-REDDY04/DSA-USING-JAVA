package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortByFreq {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
    public static String frequencySort(String s){
        HashMap<Character,Integer> hm = new HashMap<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        List<Character> chList = new ArrayList<>(hm.keySet());
        chList.sort((a,b) -> hm.get(b)-hm.get(a));
        StringBuilder res = new StringBuilder();
        for(char ch : chList){
            res.append(String.valueOf(ch).repeat(hm.get(ch)));
        }
        return res.toString();
    }
}
