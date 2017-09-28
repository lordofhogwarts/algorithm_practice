package com.bst;

public class demo {
	public static void main(String [] args) {
		BST tree = new BST();
		tree.insert(tree.root,tree.createNode(5));
//		System.out.println(tree.root.data);
		tree.insert(tree.root,tree.createNode(6));
//		System.out.println(tree.root.right.data);
		tree.insert(tree.root,tree.createNode(1));
//		System.out.println(tree.root.left.data);
		tree.insert(tree.root,tree.createNode(7));
		tree.insert(tree.root,tree.createNode(2));
		tree.inOrder(tree.root);
		tree.search(1);
		int max= tree.findmax();
		System.out.println("This tree has max value of "+ max);
		System.out.println("This tree has min value of "+ tree.findmin());
		return;
	}
}
