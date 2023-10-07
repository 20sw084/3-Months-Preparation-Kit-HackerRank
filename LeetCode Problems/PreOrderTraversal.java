// Task 144

import java.util.ArrayList;
import java.util.List;

//Definition for a binary tree node.
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {

        TreeNode temp = root;

        if (root!=null) {
            list.add(temp.val);
            preorderTraversal(temp.left);
            preorderTraversal(temp.right);
        }
        return list;
    }
}