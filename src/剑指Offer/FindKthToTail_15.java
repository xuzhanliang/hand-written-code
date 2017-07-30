package 剑指Offer;

/*
 * 链表倒数第k个数
 */
public class FindKthToTail_15 {

	public static ListNode findKthToTail(ListNode head, int k) {
		if (k < 1 || head == head) {
			return null;
		}
		ListNode p = head;
		//p向前移动k个节点
		for (int i = 1; i < k; i++) {
			if (p.next != null) {
				p = p.next;
			} else {
				return null;
			}
		}
		//head和p一起一起向前移动，当p到达末尾时，head刚好指向倒数第k个节点
		while (p.next != null) {
			head = head.next;
			p = p.next;
		}
		return head;
	}
}
