package ½£Ö¸Offer;

import java.util.concurrent.ConcurrentHashMap;

public class BinaryTreeNode {
	int value;
	BinaryTreeNode leftChild;
	BinaryTreeNode rightChild;
	
	public BinaryTreeNode(int newValue){
		leftChild=null;
		rightChild=null;
		this.value=newValue;
	}

	public BinaryTreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BinaryTreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public BinaryTreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(BinaryTreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
