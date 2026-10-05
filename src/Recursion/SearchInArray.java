package Recursion;

import static com.sun.jndi.toolkit.dir.DirSearch.search;

public class SearchInArray {
    static void main() {
        int[] arr = {22, 45, 23, 64, 21, 6, 3};
        int target=43;
        System.out.print(search(arr,target,0));
    }

    static boolean search(int[] arr,int target,int idx) {
        if(idx==arr.length)return false;
        if(arr[idx]==target)return true;
        return search(arr,target,idx+1);

    }
}
