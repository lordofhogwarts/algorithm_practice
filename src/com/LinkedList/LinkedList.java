package com.LinkedList;

public class LinkedList <T>{
	Node<T> head;
	public LinkedList() 
	{
		head= null;
	}
	public LinkedList(T data)
	{
		Node<T> newNode = new Node<T>(data);
		head = newNode;
	}
	
	public void insertToFront(Object key)
	{
		Node<T> newNode = new Node<T>(key);
		if (head == null) 
			head = newNode;
		else
		{
			newNode.next= head;
			head = newNode;
		}
		
	}
	public int length() {
		int count = 0;
		Node <T> temp = head;
		while (temp != null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	
	public void insertToBack(Object key)
	{
		Node<T> newNode = new Node<T>(key);
		Node<T> temp = head;
		if (temp == null) 
			head = newNode;
		else
		{
		while (temp.next != null)
		{
			temp= temp.next;
		//	System.out.println(temp.data);
		}
		temp.next = newNode;
		temp.next.next = null;
		}
	}

	
	public void insertAfter(Object value, Object key) {
		Node<T> newNode = new Node <T> (key);
		Node<T> temp = head;
		Node<T> secondhalf = new Node <T> ();
		if (this.search(value) != null)
		{
			while (temp!= null)
			{
				if (value == temp.data) 
					{	
						secondhalf= temp.next; /*store the second half of list somewhere else*/
						// System.out.println(temp.data);
						break;
					}
				temp=temp.next;
			}
			temp.next= newNode;
		//	System.out.println("SEARCH IS " + searchNode.next.data);
		//	System.out.println("TEMP IS " + temp.next.data);
			temp.next.next= secondhalf; /*reconnect the second half*/
		//	System.out.println("TEMP NOW IS " + temp.next.next.data);
			return;
		 }
		 System.out.println("cannot insert");
	
//		if (searchNode  == null)
//		{
//			System.out.println("Error: Cannot insert");
//			return;
//		}
//		else
//		{
//			while (temp != value)
//			{
//				temp = temp.next;
//			}
//			newNode.next = temp.next;
//			searchNode.next = newNode;
//		}
 	}
	public void delete(Object value)
	{
		Node<T> temp = head;
		Node<T> secondhalf = new Node<T> ();
		if (this.search(value) != null) {
			while (temp != null) {
				if (temp.next.data == value) {
					secondhalf = temp.next.next;
					temp.next = secondhalf;
					return;
				}
				temp= temp.next;
			}
		//	System.out.println(temp.next.data);
		//	temp= temp.next.next;
		}

	}
	public Node<T> search(Object key)
	{
	/* without getNode method */
//		Node <T> temp = head;
//		while (temp != null)
//		{
//			if (temp.data == key)
//			{
//				System.out.println("FOUND");
//				return temp;
//			}
//			temp = temp.next;
//		}
	/* with getNode method */

		if (this.getNode(key) != null) 
		{
//		System.out.println("FOUND");
			return this.getNode(key);
		}
//		System.out.println("NOT FOUND");
		return null;
	}	
	
	public Node<T> getNode(Object key)
	{
		Node <T> temp = head;
		while (temp != null)
		{
			if (temp.data == key)
				return temp;
			temp = temp.next;
		}
		return null;
	}
	public void print()
	{
			Node <T> temp = head;
			System.out.println("The list is: ");
			for (int i = 0; i< this.length();i++)
			{
				if (temp.next != null) System.out.print(temp.data + "-> ");
				else System.out.print(temp.data);
				temp= temp.next;
			}
			System.out.printf("\n");
	}
}
