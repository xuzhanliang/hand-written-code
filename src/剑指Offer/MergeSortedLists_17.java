package ½£Ö¸Offer;

public class MergeSortedLists_17 {

	public static ListNode merge(ListNode head1, ListNode head2){
		if(head1 == null){
			return head2;
		}
		if(head2 == null){
			return head1;
		}
		
		ListNode root = new ListNode();
		
		ListNode pointer = root;
		
		while(head1 != null && head2 != null){
			if(head1.val < head2.val){
				pointer.next = head1;
				head1 = head1.next;
			}else{
				pointer.next = head2;
				head2 = head2.next;
			}
			pointer = pointer.next;
		}
		if(head1 != null){
			pointer.next = head1;
		}
		if(head2!=null){
			pointer.next = head2;
		}
		return root.next;
	}
}
