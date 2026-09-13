package Array;

import java.util.ArrayList;
import java.util.Collections;


public class Arraylist {
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(5);
        arr.add(54);
        arr.add(41);
        arr.add(50);
        System.out.println(arr.get(1));
        arr.set(3,12); //arr[1]=90

        System.out.println(arr);

        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
