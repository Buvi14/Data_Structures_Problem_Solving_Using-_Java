package DynamicProgramming;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,6};
        int target = 9;
        Boolean[][] strg = new Boolean[arr.length+1][target+1];
        System.out.println(targetSum(arr, target, arr.length,strg));
    }
    public static boolean targetSum(int[] arr,int sum,int n, Boolean[][] strg){
        if(sum == 0){
            return true;
        }
        if(n==0){
            return false;
        }
        if(arr[n-1]<= sum){
            return strg[n][sum] = (targetSum(arr, sum, n-1, strg) || targetSum(arr, sum-arr[n-1], n-1, strg));
        }
        else{
            return strg[n][sum] = targetSum(arr, sum, n-1, strg);
        }
    }
}
