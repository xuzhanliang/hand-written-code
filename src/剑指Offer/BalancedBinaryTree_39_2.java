package ��ָOffer;

public class BalancedBinaryTree_39_2 {

	private boolean isBalanced = true;
	public boolean IsBalanced_Solution(TreeNode root) {
        getDepth(root);
        return isBalanced;
    }
    public int getDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=getDepth(root.left);
        int right=getDepth(root.right);
        if(Math.abs(left-right)>1){
            isBalanced=false;
        }
        return right>left?right+1:left+1;
    }
	
}
