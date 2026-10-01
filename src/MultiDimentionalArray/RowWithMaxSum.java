package MultiDimentionalArray;

public class RowWithMaxSum {
    public static void main(String[] args){
        int[][] arr={{2,6,4,3},{5,7,3,8},{3,6,2,7}};
        int row=-1;
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++) {
                sum = sum + arr[i][j];
            }
            if (sum>MaxSum) {
                MaxSum=sum;
                row=i;
            }
        }
        System.out.println(row+" "+MaxSum);
    }
}
