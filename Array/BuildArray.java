package Array;

// 1920. Build Array from Permutation leetcode

public class BuildArray {
    public static void main(String[] args) {
        for(int i :buildArray(new int[]{0,2,1,5,3,4})){
            System.out.print(i+ " ");
        }
    }
    public static int[] buildArray(int[] nums) {
        if(nums.length == 1){
            return nums;
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]= nums[nums[i]];
        }
        return ans;
    }
}
