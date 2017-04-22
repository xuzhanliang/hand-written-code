package binaryTree;

import java.util.Stack;

public class Node {

	public int value;
	public Node left;
	public Node right;
	public Node(int data) {
		this.value = data;
	}
	public void perOrderRecur(Node head){
		if(head == null){
			return ;
		}
		System.out.println(head.value + " ");
		perOrderRecur(head.left);
		perOrderRecur(head.right);
	}
	
	public void inOrderRecur(Node head){
		if(head == null){
			return ;
		}
		perOrderRecur(head.left);
		System.out.println(head.value + " ");
		perOrderRecur(head.right);
	}
	
	public void posOrderRecur(Node head){
		if(head == null){
			return ;
		}
		perOrderRecur(head.left);
		perOrderRecur(head.right);
		System.out.println(head.value + " ");
	}
	
	public void perOrderUnRecur(Node head){
		System.out.println("pre-order:");
		if(head!=null){
			Stack<Node> stack = new Stack<Node>();
			stack.add(head);
			while(!stack.isEmpty()){
				head = stack.pop();
				System.out.println(head.value + " ");
				if(head.right!=null){
					stack.push(head.right);
				}
				if(head.left!=null){
					stack.push(head.left);
				}
			}
		}
	}
	
	public void inOrderUnRecur(Node head){
		System.out.println("in-order: ");
		if(head!=null){
			Stack<Node> stack = new Stack<>();
			while(!stack.isEmpty() || head!=null){
				if(head!=null){
					stack.push(head);
					head = head.left;
				}else{
					head = stack.pop();
					System.out.println(head.value + " ");
					head = head.right;
				}
			}
		}
	}
	
	public void posOrderUnRecur(Node head){
		System.out.println("pos-order");
		if(head!=null){
			Stack<Node> s1= new Stack<>();
			Stack<Node> s2 = new Stack<>();
			while(!s1.isEmpty()){
				head = s1.pop();
				s2.push(head);
				if(head.left!=null){
					s1.push(head.left);
				}
				if(head.right!=null){
					s1.push(head.right);
				}
			}
			while(!s2.isEmpty()){
				System.out.println(s2.pop().value + " ");
			}
		}
	}
}
