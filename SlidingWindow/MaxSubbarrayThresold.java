package SlidingWindow;

// Given an array of integers arr and two integers k and threshold.
// Return the number of sub-arrays of size k and average greater than or equal to threshold.
// arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
public class MaxSubbarrayThresold {
    public static void main(String[] args) {
        System.out.println(numOfSubarrays(new int[]{7,7,7,7,7,7,7},7,7));
    }
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0,count=0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        if(sum/k >= threshold) {count++;}
        for (int i = k; i < arr.length; i++) {
            sum += arr[i]-arr[i-k];
            if(sum/k >= threshold) {count++;}
        }
        return count;
    }
}
