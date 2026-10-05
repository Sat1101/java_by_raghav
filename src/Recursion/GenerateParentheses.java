package Recursion;

import java.util.ArrayList;
import java.util.List;



public class GenerateParentheses {
    static void main() {
        int n=2;
        List<String> list = new ArrayList<>();
        solve(0, 0, "", list);
        System.out.print(list+"");
    }

    static void solve(int left,int right,String s,List<String> list) {
        int n=2;
        if(right==n ){
            list.add(s);
            return;
        }
        if(left<n)solve(left+1,right,s+'(',list);
        if(left>right)solve(left,right+1,s+')',list);
    }
}

