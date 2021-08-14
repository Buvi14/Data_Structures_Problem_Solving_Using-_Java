package Array;

import java.util.*;

// 1389. Create Target Array in the Given Order

public class CreateTargetArray {
    public static void main(String[] args) {
        for(int i :createTargetArray(new int[]{1,2,3,4,0},new int[]{0,1,2,3,0})){
            System.out.print(i+ " ");
        }
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i],nums[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            target[i]= list.get(i);
        }
        return target;
    }
}
