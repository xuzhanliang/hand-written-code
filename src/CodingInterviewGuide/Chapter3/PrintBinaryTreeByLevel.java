package CodingInterviewGuide.Chapter3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class PrintBinaryTreeByLevel {

	public static void main(String[] args) {
		Node d= new Node(4, null, null);
		Node g = new Node(7, null, null);
		Node h = new Node(8, null, null);
		Node f = new Node(6, null, null);
		Node e = new Node(5, g, h);
		Node b = new Node(2, d, null);
		Node c = new Node(3, e, f);
		Node a = new Node(1, b, c);
		printByLevel(a);
	}
	public static void printByLevel(Node head){
		if(head == null){
			return ;
		}
		Queue<Node> queue = new LinkedList<Node>();
		int level = 1;
		Node last=head;
		Node nLast=null;//记录下一层层最后一个节点
		queue.offer(head);
		System.out.print("Level "+(level++) + " : ");
		while(!queue.isEmpty()){
			head = queue.poll();
			System.out.print(head.value + " ");
			if(head.left!=null){
				queue.offer(head.left);
				nLast = head.left;
			}
			if(head.right!=null){
				queue.offer(head.right);
				nLast = head.right;
			}
			if(head == last && !queue.isEmpty()){//last表示当前行最后一个节点，如果当前结点等于last说明该换行了，把记录到的下一行nLast赋值给last进行下一次循环。
				System.out.print("\nLevel "+(level++) + " : ");
				last = nLast;
			}
		}
		System.out.println();
	}
	public static void printByZ(Node head){
		if(head == null){
			return ;
		}
		Deque<Node> dq = new LinkedList<Node>();
		int level = 1;
		boolean lr =true;
		Node last = head;
		Node nLast = null;
		dq.offerFirst(head);
		printLevelAndOrientation(level++,lr);
	}
	private static void printLevelAndOrientation(int i, boolean lr) {
		System.out.print("Level " + i + " from ");
		System.out.print(lr ? "left to right" : "right to left");
		
	}
}
