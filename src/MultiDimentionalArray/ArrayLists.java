package MultiDimentionalArray;

import java.util.ArrayList;

public class ArrayLists {
    static void main() {
        ArrayList<Integer> a=new ArrayList<> ();
        a.add(13);a.add(64);a.add(4);
        ArrayList<Integer> b=new ArrayList<> ();
        b.add(12);b.add(5);b.add(5);
        ArrayList<Integer> c=new ArrayList<> ();
        c.add(56);c.add(8);c.add(17);
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        arr.add(a);arr.add(b);arr.add(c);

        System.out.println(arr);

        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }

        for(ArrayList<Integer> list:arr){
            for(int ele: list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
