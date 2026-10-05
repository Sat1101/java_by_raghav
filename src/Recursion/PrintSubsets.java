package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsets {
    static void main() {
        String s="abc";
        List<String> list=new ArrayList<>();
        subset("",s,0,list);
        System.out.print(list+" ");
    }

    static void subset(String ans,String s,int idx,List<String> list) {
        if(idx==s.length()){
            if(ans.length()!=0) list.add(ans);
            return;
        }
        char ch=s.charAt(idx);
        subset(ans+ch,s,idx+1,list); //pick
        subset(ans,s,idx+1,list);  //skip

    }
}
