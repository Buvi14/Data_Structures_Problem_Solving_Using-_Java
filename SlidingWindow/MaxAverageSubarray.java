package SlidingWindow;


// Write a function for maximum average of given subarray with a given window


public class MaxAverageSubarray {
    public static void main(String[] args) {
        System.out.println(maxAverage(new int[]{1,12,-5,-6,50,3}, 4));
    }
    public static double maxAverage(int[] arr, int k){
        double x,max=0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        max = x = (double) sum / k;
        for (int end = k; end < arr.length; end++) {
            sum+= arr[end] - arr[end-k];
            x = (double) sum / k;
            if(x>max){
                max=x;
            }
        }
        
        return max;
    }
}
