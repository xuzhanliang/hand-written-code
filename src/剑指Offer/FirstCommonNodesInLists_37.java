package 剑指Offer;



public class FirstCommonNodesInLists_37 {
	
	    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
			int length1 = getListLength(pHead1);
			int length2 = getListLength(pHead2);
			int dis = length1 - length2;
			ListNode longHead = pHead1;
			ListNode shortHead = pHead2;
			if(length2 > length1){
				longHead = pHead2;
				shortHead = pHead1;
				dis = length2 - length1;
			}
			//让长的链表先走dis步
			for(int i = 0;i<dis;i++){
				longHead = longHead.next;
			}
			while(longHead!=null && shortHead!=null && longHead!=shortHead){
				longHead = longHead.next;
				shortHead = shortHead.next;
			}
			return longHead;
	    }
	    //最简单的解法！！！
	    public ListNode FindFirstCommonNode1(ListNode pHead1, ListNode pHead2) {
	 		ListNode p1=pHead1,p2=pHead2;
	        while(p1!=p2){
	            p1=( p1!=null ? p1.next:pHead2);
	            p2=( p2!=null ? p2.next:pHead1);
	        }
	        return p1;
	    }
		private static int getListLength(ListNode pHead) {
			int length = 0;
			ListNode node = pHead;
			while(node!=null){
				++length;
				node = node.next;
			}
			return length;
		}
	}

