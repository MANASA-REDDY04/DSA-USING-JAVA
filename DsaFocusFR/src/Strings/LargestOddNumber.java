package Strings;

public class LargestOddNumber {
    public static void main(String[] args) {
        String s = "54278";
        System.out.println(largestOddNumber(s));
    }
    public static String largestOddNumber(String num){
       int n = num.length();
       int idx = -1;
       for(int i = n-1; i >= 0; i--){
           int x = num.charAt(i)-'0';
           if(x%2 != 0){
               idx = i;
               break;
           }
       }
       if(idx == -1) return "";
       return num.substring(0,idx+1);
    }
}
