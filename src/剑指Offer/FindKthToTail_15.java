package ��ָOffer;

/*
 * ��������k����
 */
public class FindKthToTail_15 {

	public static ListNode findKthToTail(ListNode head, int k) {
		if (k < 1 || head == head) {
			return null;
		}
		ListNode p = head;
		//p��ǰ�ƶ�k���ڵ�
		for (int i = 1; i < k; i++) {
			if (p.next != null) {
				p = p.next;
			} else {
				return null;
			}
		}
		//head��pһ��һ����ǰ�ƶ�����p����ĩβʱ��head�պ�ָ������k���ڵ�
		while (p.next != null) {
			head = head.next;
			p = p.next;
		}
		return head;
	}
}
