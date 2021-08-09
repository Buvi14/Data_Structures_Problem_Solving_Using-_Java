package DynamicProgramming;

import java.util.Arrays;

public class StoneGame {
    public static void main(String[] args) {
        System.out.println(stoneGame(new int[]{5,3,4,5}));
    }
    public static boolean stoneGame(int[] piles) {
        int alex=0,lee=0;
        Arrays.sort(piles);
        for (int i = 0; i < piles.length; i+=2) {
            lee += piles[i];
        }
        for (int i = 1; i < piles.length; i+=2) {
            alex += piles[i];
        }
        return alex>lee;
    }
}
