package ��ָOffer;

class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
public class ConstructBinaryTree_06 {
	public  TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		if(pre.length!=in.length || pre.length==0||in.length==0){
			return null;
		}
		int i = 0;
		TreeNode root = new TreeNode(pre[0]);//���ڵ���ǰ������ĵ�һ��
		while(in[i]!=root.val){
			i++;//�ҵ�Root�������λ��
		}
		//�����ĸ����飬����i��ֵȷ���ֽ磬ע���±�Խ������
		int[] preLeft = new int [i];
		int[] inLeft = new int [i];
		int[] preRight = new int[pre.length-i-1];
		int[] inRight = new int[in.length-i-1];
		for(int j=0;j<in.length;j++){
			if(j<i){//���������
				preLeft[j] = pre[j+1];
				inLeft[j] = in[j];
			}else if(j>i) {//���������
				preRight[j-i-1] = pre[j];
				inRight[j-i-1] = in[j];
			}
		}
		root.left = reConstructBinaryTree(preLeft, inLeft);
		root.right = reConstructBinaryTree(preRight, inRight);
		return root;

    }
	
}
