package Tree;



public class RangeSumBST {
    public static void main(String[] args) {
        // rangeSumBST(root, low, high)
    }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        int sum =0;

        if(root.val >=low || root.val <= high){
            sum+= root.val;
        }

        if(root.val >=low || root.val >= high){
            sum+= rangeSumBST(root.left, low, high);
        }
        if(root.val <=low || root.val<=high){
            sum+=rangeSumBST(root.right, low, high);
        }
        return sum;
    }
}
