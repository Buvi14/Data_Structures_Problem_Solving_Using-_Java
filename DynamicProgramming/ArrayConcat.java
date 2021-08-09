package DynamicProgramming;
public class ArrayConcat {
    public static void main(String[] args) {
        long btr = System.currentTimeMillis();
        getConcatenationbtr(new int[]{1,2,3});
        long str = System.currentTimeMillis();
        System.out.println(str-btr);
        // long btr1 = System.currentTimeMillis();
        // getConcatenation(new int[]{1,2,3});
        // long str1 = System.currentTimeMillis();
        // System.out.println(str1-btr1);
    }

    public static int[] getConcatenationbtr(int[] nums){
        int[] ans = new int[2*nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
        return ans;
    }

    public static int[] getConcatenation(int[] nums){
        int[] ans = new int[2*nums.length];
        for (int i = 0; i < ans.length; i++) {
            if(i<nums.length){
                ans[i] = nums[i];
            }
            else{
                ans[i] = nums[i%nums.length];
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
        return ans;
    }
}
