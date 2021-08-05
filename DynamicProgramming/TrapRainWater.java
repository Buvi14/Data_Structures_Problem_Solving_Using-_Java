public class TrapRainWater {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{4,2,0,3,2,5}));
    }

    private static int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right  = new int[height.length];
        int water=0;
        left[0]=height[0];
        right[right.length-1]=height[height.length-1];
        for (int i = 1 ; i < left.length; i++) {
            left[i]= Math.max(left[i-1], height[i]);
        }
        for (int i = right.length-2; i >=0 ; i--) {
            right[i] = Math.max(right[i+1], height[i]);
        }
        for (int i = 0; i < height.length; i++) {
            water += Math.min(left[i],right[i]) - height[i];
        }
        return water;
    }
}
