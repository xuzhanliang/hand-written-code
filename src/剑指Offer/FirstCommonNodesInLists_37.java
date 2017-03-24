package ½£Ö¸Offer;

import java.util.Stack;


public class FirstCommonNodesInLists_37 {
	
	    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
			if(pHead1==null||pHead2==null){
				return null;
			}
	    	Stack<Integer> stack1 = new Stack<Integer>();
	    	while(pHead1.next!=null){
	    		stack1.push(pHead1.val);
	    		pHead1=pHead1.next;
	    	}
	    	Stack<Integer> stack2 = new Stack<Integer>();
	    	while(pHead1.next!=null){
	    		stack1.push(pHead1.val);
	    		pHead1=pHead1.next;
	    	}
	    	
	    	return pHead2;
	 
	    }
	}

