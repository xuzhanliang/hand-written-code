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
		//printByLevel(a);
		printByZ(a);
	}
	/*
	 * �������İ����ӡ
	 * ˼·��last��nLast�����ڵ�
	 * nLast��ʾ��һ�е����ڵ�
	 */
	public static void printByLevel(Node head){
		if(head == null){
			return ;
		}
		Queue<Node> queue = new LinkedList<Node>();
		int level = 1;
		Node last=head;
		Node nLast=null;//��¼��һ������һ���ڵ�
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
			if(head == last && !queue.isEmpty()){//last��ʾ��ǰ�����һ���ڵ㣬�����ǰ������last˵���û����ˣ��Ѽ�¼������һ��nLast��ֵ��last������һ��ѭ����
				System.out.print("\nLevel "+(level++) + " : ");
				last = nLast;
			}
		}
		System.out.println();
	}
	/*
	 * ������֮�ʹ�ӡ-˫���б�
	 * ԭ��1�������ҵĹ��̣���dq��ͷ�����ڵ㣬
	 * ��������Ľڵ�û�к��ӽڵ㣬-��
	 * ��������Ľڵ��к��ӽڵ㣬�������Ӵ�β����dq�������Һ��Ӵ�β������dq��
	 * 
	 * ԭ��2�����ҵ���Ĺ��̣���dq��β�������ڵ㣬
	 * ��������ڵ�û�к��ӽڵ㣬-��
	 * ��������Ľڵ��к��ӽڵ㣬�����Һ��Ӵ�ͷ��ȥdq���������Ӵ�ͷ��ȥdq
	 */
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
		while(!dq.isEmpty()){
			if(lr){//ԭ��1
				head = dq.pollFirst();
				if(head.left!=null){
					nLast = nLast == null ? head.left : nLast;
					dq.offerLast(head.left);
				}
				if(head.right!=null){
					nLast = nLast == null ? head.right : nLast;
					dq.offerLast(head.right);
				}
				
			}else{//ԭ��2
				head = dq.pollLast();
				if(head.right!=null){
					nLast = nLast == null ? head.right : nLast;
					dq.offerFirst(head.right);
				}
				if(head.left!=null){
					nLast = nLast == null ? head.left : nLast;
					dq.offerFirst(head.left);
				}
			}
			System.out.print(head.value + " ");
			if(head==last && !dq.isEmpty()){
				lr = !lr;
				last = nLast;
				nLast = null;
				System.out.println();
				printLevelAndOrientation(level++,lr);
			}
		}
		System.out.println();
	}
	private static void printLevelAndOrientation(int i, boolean lr) {
		System.out.print("Level " + i + " from ");
		System.out.print(lr ? "left to right : " : "right to left : ");
		
	}
}
