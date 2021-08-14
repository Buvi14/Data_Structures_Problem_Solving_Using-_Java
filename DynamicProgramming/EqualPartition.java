package DynamicProgramming;

public class EqualPartition {
    public static void main(String[] args) {
        System.out.println(canPartition_tab(new int[]{1,5,11}));
    }

    public static boolean canPartition_tab(int[] nums) {
        int sum =0;
        for (int i : nums) {
            sum+=i;
        }
        if(sum%2!=0){
            return false;
        }
        sum = sum/2;
        Boolean[][] strg = new Boolean[nums.length+1][sum+1];
        for (int i = 0; i < nums.length+1; i++) {
            for (int j = 0; j < sum+1; j++) {
                if(j==0){
                    strg[i][j]= true;
                }
                else if(i==0){
                    strg[i][j] = false;
                }
                else{
                    if(j-nums[i-1]>=0){
                        strg[i][j] = strg[i-1][j-nums[i-1]];
                    }
                    else{
                        strg[i][j] = strg[i][j-1];
                    }
                }
            }
        }
        return strg[nums.length][sum];
    }


    public static boolean canPartition(int[] nums) {
        int sum =0;
        for (int i : nums) {
            sum+=i;
        }
        if(sum%2!=0){
            return false;
        }
        sum = sum/2;
        Boolean[][] strg = new Boolean[nums.length+1][sum+1];
        return solve(nums,sum,nums.length,strg);
    }
    public static boolean solve(int[] nums, int sum,int n,Boolean[][] strg){
        if(sum ==0){
            return true;
        }
        if(n==0){
            return false;
        }
        if(strg[n][sum]!=null){
            return strg[n][sum];
        }
        if(nums[n-1]<= sum){
            return strg[n][sum]=solve(nums, sum, n-1, strg) || solve(nums, sum-nums[n-1], n-1, strg);
        }
        else{
            return strg[n][sum]=solve(nums, sum, n-1, strg);
        }
    }
}
