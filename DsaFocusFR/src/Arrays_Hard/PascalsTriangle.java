package Arrays_Hard;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 4;
        List<Integer> li = new ArrayList<>();
//        Print Row
        li.add(1);
        int ans = 1;
        for(int i = 1; i <= n; i++){
            ans = ans * (n-i+1);
            ans = ans/i;
            li.add(ans);
        }
        System.out.println(li);
    }
}
