package com.LinkedList;

public class demo {

	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<Integer>(2);
		list.insertToBack(3);
		list.insertToBack(5);
		list.insertToBack(6);
		list.insertToBack(8);
//		System.out.println(list.head.next.data);
		list.insertToBack(9);
		list.print();
		System.out.println("Size of list is " + list.length());
//		Node<Integer> sample = list.search(3);
//		System.out.println(sample.data);
//		System.out.println(sample.next.data);
//		list.search(80);
//		list.insertAfter(3, 7);
//		System.out.println("After adding");
//		list.print();
//		list.delete(7);
//		System.out.println("After deleting");
//		list.print();
//		System.out.println(list.head.next.next.next.data);

	}

}
