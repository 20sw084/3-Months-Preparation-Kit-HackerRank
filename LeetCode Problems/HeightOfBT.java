package BinaryTreeProblems;

public class HeightOfBT {
    public static int heightOfBT(BinaryTreeClass.TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHeight = heightOfBT(root.left);
        int rightHeight = heightOfBT(root.right);

        //Same Logic
//        int leftHeight = 0, rightHeight = 0;
//        if(root.left != null){
//            leftHeight = heightOfBT(root.left);
//        }
//        if(root.right != null){
//            rightHeight = heightOfBT(root.right);
//        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        //        3
        //      2    7
        //         5
        //       4
        int[] nums = {3, 2, -1, -1, 7, 5, 4, -1, -1, -1, -1};
//        int[] nums = {3, 1, -1, -1, 4, -1, -1};
        BinaryTreeClass tree = new BinaryTreeClass();
        BinaryTreeClass.TreeNode root = tree.buildTree(nums);
        System.out.println(heightOfBT(root));
    }

}