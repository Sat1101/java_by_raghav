package MultiDimentionalArray;

public class PrintColWise {
    public static void main(String[] args){
        int[][] arr={{2,6,4,3},{5,7,3,8},{3,6,2,7}};
        System.out.println(arr.length+" "+arr[0].length);
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
