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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            mpp.put(inorder[i],i);
        }
        TreeNode root=buildingTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1,mpp);
        return root;
    }

    public TreeNode buildingTree(int[] inorder,int instart,int inend,int[] postorder,int poststart,int postend,HashMap<Integer,Integer> mpp){
            if(inend<instart || postend<poststart){
                return null;
            }

            TreeNode root=new TreeNode(postorder[postend]);
            int inRoot=mpp.get(root.val);
            int numsleft=inRoot-instart;

            root.left=buildingTree(inorder,instart,inRoot-1,postorder,poststart,poststart+numsleft-1,mpp);

            root.right=buildingTree(inorder,inRoot+1,inend,postorder,poststart+numsleft,postend-1,mpp);

            return root;
    }
}