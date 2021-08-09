package DynamicProgramming;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int res[] = new int[2];
        res = two_sum(new int[] {2,7,11,15},  18);
        for (int i : res) {
            System.out.println(i);
        }
    }

    private static int[] two_sum(int[] nums, int target) {
        HashMap<Integer,Integer> st = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer diff = (Integer) target-nums[i];
            if(st.containsKey(diff)){
                int arr[] = {st.get(diff),i};
                return arr;
            }
            st.put(nums[i],i);
        }
        return null;
    }
}
