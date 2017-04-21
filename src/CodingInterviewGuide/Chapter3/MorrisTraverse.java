package CodingInterviewGuide.Chapter3;

/**
 * 遍历二叉树的神级方法
 * 时间复杂度O(N)，空间复杂度O(1)
 * @author Administrator
 *
 */
public class MorrisTraverse {

	public static void main(String[] args) {
		Node a = new Node(1,null,null);
		Node c = new Node(3,null,null);
		Node e = new Node(5,null,null);
		Node g = new Node(7,null,null);
		Node b = new Node(2,a,c);
		Node f = new Node(6,e,g);
		Node d = new Node(4,b,f);
		
		morisIn(d);
	}
	public static void morisIn(Node head){
		if(head == null){
			return ;
		}
		Node cur1 = head;
		Node cur2 = null;
		while(cur1 !=null){
			cur2 = cur1.left;
			if(cur2!=null){
				while(cur2.right != null && cur2.right != cur1){
					cur2 = cur2.right;
				}
				if(cur2.right == null){
					cur2.right = cur1;
					cur1 = cur1.left;
					continue;
				}else{
					cur2.right = null;
				}
			}
			System.out.print(cur1.value+" ");
			cur1 = cur1.right;
		}
		System.out.println();
	}
}
