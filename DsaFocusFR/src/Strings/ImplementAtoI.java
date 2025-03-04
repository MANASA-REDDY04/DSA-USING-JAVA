package Strings;

public class ImplementAtoI {
    public static void main(String[] args) {
        String s = "-1337c0d3";
        System.out.println(myAtoi(s));
    }
//    incorrect
    public static int myAtoi(String s) {
        s = s.trim();
        char sign = '+';
        int n = s.length();
        int index = -1;
        for(int i = 0; i < n; i++){
            if(i == 0 && s.charAt(0) == '-') sign = '-';
            else if(!Character.isDigit(s.charAt(i))){
                index = i;
                break;
            }
        }
        if(index == -1) return 0;

        if(sign == '-'){
            int num = Integer.parseInt(s.substring(1,index));
            return -num;
        }
        return Integer.parseInt(s.substring(0,index));
    }
}
