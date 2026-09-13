package Array;
// this is code from gfg
public class MissingInArray {
        int missingNum(int arr[]) {
            // code here
            long n=arr.length+1;
            long sum=n*(n+1)/2;
            long arrSum=0;
            for(int ele:arr){
                arrSum=arrSum+ele;
            }
            return (int)(sum-arrSum);
        }
}

