package ½£Ö¸Offer;

import java.util.Stack;

public class QueueWithTwoStacks_07 {

	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	public void push(int node){
		stack1.push(node);
	}
	public int pop(){
		shiftStacks();
		return stack2.pop();
	}
	private void shiftStacks() {
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
	}
	
}
