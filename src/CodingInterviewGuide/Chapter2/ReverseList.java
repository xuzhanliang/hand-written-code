package CodingInterviewGuide.Chapter2;

public class ReverseList {

	public Node reverserList(Node head){
		Node pre = null;
		Node next = null;
		while(head!=null){
			next = head.next;
			//先用next保存head的下一节点的信息，保证单链表不会因为失去head节点的原next节点而就此断裂
			head.next = pre;
			//让head指向pre
			pre = head;
			//pre指向head，等于后移一格
			head = next;
			//将前面保存的head的next节点作为下次循环的head
		}
		return pre;
	}
}
