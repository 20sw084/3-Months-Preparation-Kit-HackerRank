
import java.util.LinkedList;
import java.util.Queue;

 class BinaryTreeClass {
    static class TreeNode{
        int value;
        TreeNode leftNode;
        TreeNode rightNode;

        public TreeNode(int data) {
            this.value = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }
    public void printTree(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()){
            TreeNode removedNode = queue.remove();
            if(removedNode == null){
                if(queue.isEmpty()){
                    break;
                }
                else {
                    System.out.println();
                    queue.add(null);
                }
            }
            else{
                System.out.print(removedNode.value + " ");
                if(removedNode.leftNode != null)
                    queue.add(removedNode.leftNode);
                if(removedNode.rightNode != null)
                    queue.add(removedNode.rightNode);
            }
        }
    }

        static int index = -1;
        public TreeNode buildTree(int[] nums){
            index++;
            if(nums[index] == -1){
                return null;
            }

            TreeNode newNode = new TreeNode(nums[index]);
            newNode.leftNode = buildTree(nums);
            newNode.rightNode = buildTree(nums);

            return newNode;
        }

    public static void main(String[] args) {
        int[] nums = {3, 2 , -1, -1, 4, -1, -1};
        BinaryTreeClass tree = new BinaryTreeClass();
        TreeNode root = tree.buildTree(nums);
        System.out.println(root.value);
        System.out.println(root.leftNode.value);
        System.out.println(root.rightNode.value);
    }
}