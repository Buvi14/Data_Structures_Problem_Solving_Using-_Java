package DynamicProgramming;

public class MaxSubArray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {
        int max= Integer.MIN_VALUE;
        int[] st = new int[nums.length+1];
        st[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            st[i] = Math.max(nums[i],nums[i]+st[i-1]);
            max = Math.max(st[i], max);
        }
        return max;
    }
}
