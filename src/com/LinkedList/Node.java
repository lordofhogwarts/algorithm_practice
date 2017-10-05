package com.LinkedList;

public class Node<T> {
	T data;
	Node<T> next;
	public Node() {
	}
	public Node(Object data)
	{
		T data2= (T) data;
		this.data = data2;
		this.next = null;
	}
	public Node(Object data, Node<T> next)
	{
		T data2 = (T) data;
		this.data = data2;
		this.next = next;
	}
}
