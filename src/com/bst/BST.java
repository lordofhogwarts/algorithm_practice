package com.bst;

public class BST {
	Node root;
	public BST() {
		this.root= null;
	}
	
	public void insert(Node begin, Node key) {
		if (root == null) 
		{
			root = key;
			return;
		}
		if (key.data > begin.data)
		{
			if (begin.right == null) begin.right = key;
			else insert(begin.right,key);
		}
		if (key.data <= begin.data)
		{
			if (begin.left == null) begin.left = key;
			else insert(begin.left,key);
		}
	}
	
	public void search(int key)
	{
		if (root==null)
		{
			System.out.println("Key not found");
			return;
		}
		Node current = root;
		while(current != null)
		{
			if (current.data == key)
			{
				System.out.println("Key is found");
				return;
			}
			else if (key< current.data)
				current= current.left;
			else
			current= current.right;
		}
	}

	public int findmax()
	{
		Node current = root;
		while (current.right != null) {
			current=current.right;
//			System.out.println(current.right.data);
		}
		return current.data;
	}
	
	public int findmin()
	{
		Node current = root;
		while (current.left != null) {
			current=current.left;
		//	System.out.println(current.data);
		}
		return current.data;
	}
	
	public void inOrder(Node root) {
		if (root == null) return;
		
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
	}
	
	public Node createNode(int value) {
		return new Node(value,null,null);
	}
	
	
	public void delete(int key)
	{
		
	}
		

}
