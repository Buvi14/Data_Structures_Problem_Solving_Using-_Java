package Array;

public class KeyCheckSegment {
    public static void main(String[] args) {
        System.out.println(findkwindow(new int[] { 5, 8, 7, 12, 14, 3, 9}, 8, 2));
    }
    // Check if a key is present in every segment of size k in an array

    public static boolean findkwindow(int[] nums,int x, int k){
        int start =0, temp=k;
        int end = nums.length,flag=0;
        while(start<end){
            if(start<temp){
                if(nums[start] == x){
                    flag=1;
                }
                start++;
            }
            if(start==temp-1){
                if(flag==0){
                    return false;
                }
                start=temp;
                temp+=k;
            }
        }
        return true;
    }
}
