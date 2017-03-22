package 剑指Offer;
/**
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像
 * @author lenovo
 *
 */
public class MirrorOfBinaryTree_19 {

	public static void MirrorRecursively(BinaryTreeNode root){
		if(root==null){
			return ;
		}
		if(root.getLeftChild()==null && root.getRightChild()==null){
			return ;
		}
		BinaryTreeNode temp = root.getLeftChild();
		root.setLeftChild(root.getRightChild());
		root.setRightChild(temp);
		MirrorRecursively(root.getLeftChild());
		MirrorRecursively(root.getRightChild());
	}
	private static void  show(BinaryTreeNode root) {
		if(root!=null){
			System.out.println(root.getValue());
			show(root.getLeftChild());
			show(root.getRightChild());
		}
	}
	public static void main(String[] args) {
		BinaryTreeNode node1=new BinaryTreeNode(8);
		BinaryTreeNode node2=new BinaryTreeNode(6);
		BinaryTreeNode node3=new BinaryTreeNode(10);
		BinaryTreeNode node4=new BinaryTreeNode(5);
		BinaryTreeNode node5=new BinaryTreeNode(7);
		BinaryTreeNode node6=new BinaryTreeNode(9);
		BinaryTreeNode node7=new BinaryTreeNode(11);
		node1.setLeftChild(node2);node1.setRightChild(node3);
		node2.setLeftChild(node4);node2.setRightChild(node5);
		node3.setLeftChild(node6);node3.setRightChild(node7);
		MirrorRecursively(node1);
		show(node1);
	}
}
