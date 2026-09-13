package Array;

public class SearchInArray {
    public static void main(String[] args){
        int[] arr={9,75,5,6,23,7,31};
        int Target=45;
        Boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==Target) flag=true;
            break;
        }
        System.out.print(flag);
    }
}
