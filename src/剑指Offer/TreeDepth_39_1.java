package ½£Ö¸Offer;

public class TreeDepth_39_1 {

	public static int TreeDepth(BinaryTreeNode head){
		if(head == null){
			return 0;
		}
		int left = TreeDepth(head.leftChild);
		int right = TreeDepth(head.rightChild);
		return (left>right) ? (left + 1) : (right + 1);
	}
}
