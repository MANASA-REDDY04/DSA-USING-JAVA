package Strings;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        System.out.println(rotateString(s,goal));
    }
    public static boolean rotateString(String s, String goal){
        if(s.length() != goal.length()) return false;
        String ss = s+s;
        if(ss.contains(goal)) return true;
        else return false;
    }
}
