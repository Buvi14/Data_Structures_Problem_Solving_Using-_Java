package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class Decompresslist_Array {
    public static void main(String[] args) {
        decompressRLElist(new int[]{1,1,2,3});
    }
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> Lp = new ArrayList<>();
        for (int i = 0; i < nums.length; i+=2) {
            for (int j = 0; j < nums[i]; j++) {
                Lp.add(nums[i+1]);
            }
        }
        int[] res= new int[Lp.size()];
        for (int i=0;i<Lp.size();i++) {
            res[i]= Lp.get(i);
        }
        for (int i : res) {
            System.out.print(i+" ");
        }
        return null;
    }
}
