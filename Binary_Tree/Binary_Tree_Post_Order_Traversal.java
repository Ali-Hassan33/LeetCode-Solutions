/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
public List<Integer> postorderTraversal(TreeNode root) {
  LinkedList<Integer> result=new LinkedList<>();
  Stack<TreeNode> stack=new Stack<>();
  TreeNode curr=root;
  while(curr!=null || !stack.isEmpty()){
      while(curr!=null){
      result.addFirst(curr.val);
      stack.push(curr);
      curr=curr.right;
  }
    // in case if there is no node present then curr will point to its root with the help of stack.
    curr=stack.pop();
    curr=curr.left;
}
    return result;
} 
   }
