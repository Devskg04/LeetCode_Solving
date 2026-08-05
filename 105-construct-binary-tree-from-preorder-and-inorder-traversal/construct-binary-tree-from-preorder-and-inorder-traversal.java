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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            mpp.put(inorder[i],i);
        }
        TreeNode root=buildingTree(inorder,0,inorder.length-1,preorder,0,preorder.length-1,mpp);
        return root;
    }

    public TreeNode buildingTree(int[] inorder,int instart,int inend,int[] preorder,int prestart,int preend,HashMap<Integer,Integer> mpp){
            if(inend<instart || preend<prestart){
                return null;
            }

            TreeNode root=new TreeNode(preorder[prestart]);
            int inRoot=mpp.get(root.val);
            int numsleft=inRoot-instart;

            root.left=buildingTree(inorder,instart,inRoot-1,preorder,prestart+1,prestart+numsleft,mpp);
            root.right=buildingTree(inorder,inRoot+1,inend,preorder,prestart+numsleft+1,preend,mpp);

            return root;
    }
}