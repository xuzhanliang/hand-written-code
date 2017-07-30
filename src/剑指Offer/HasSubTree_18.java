package ��ָOffer;


public class HasSubTree_18 {

	/**
	 * Ҫ������A ���Ƿ���ں���B �ṹһ�������������ǿ��Էֳ������� 
	 * ��һ������A ���ҵ���B �ĸ�����ֵһ���Ľ��R�� 
	 * �ڶ������ж���A ����R Ϊ�����������ǲ��ǰ�������B һ���Ľṹ��
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
