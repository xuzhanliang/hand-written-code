package 剑指Offer;


public class HasSubTree_18 {

	/**
	 * 要查找树A 中是否存在和树B 结构一样的子树，我们可以分成两步： 
	 * 第一步在树A 中找到和B 的根结点的值一样的结点R， 
	 * 第二步再判断树A 中以R 为根结点的子树是不是包含和树B 一样的结构。
	 * @param root1
	 * @param root2
	 * @return
	 */
	public static boolean hasSubtree(BinaryTreeNode root1,BinaryTreeNode root2){
		if(root1 == root2){
			return true;
		}
		if(root2 == null){
			return true;
		}
		if(root1 == null){
			return false;
		}
		boolean result = false;
		if(root1.value == root2.value){
			result = match(root1,root2);
		}
		if(result){
			return true;
		}
		return hasSubtree(root1.leftChild, root2) || hasSubtree(root1.rightChild, root2);
	}

	private static boolean match(BinaryTreeNode root1, BinaryTreeNode root2) {
		if(root1 == root2){
			return true;
		}
		if(root2 == null){
			return true;
		}
		if(root1 == null){
			return false;
		}
		if(root1.value == root2.value){
			return match(root1.leftChild, root2.leftChild) && match(root1.rightChild, root2.rightChild);
		}
		
		return false;
	}
}
