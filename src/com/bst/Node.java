package com.bst;

public class Node {
	public int data;
	Node left;
	Node right;
	// constructor
		public Node (int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
		public Node() {
			this.data=0;
			this.right= null;
			this.left= null;
		}
		public Node(int data)
		{
			this.data= data;
			this.left= null;
			this.right= null;
		}

}
