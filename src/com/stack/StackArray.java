package com.stack;

public class StackArray <T> {
	Object [] ArrayStack;
	int size;
	int top;
	public StackArray(int size) {
		this.size= size;
		ArrayStack = new Object [this.size];
		//top=-1 because there isn't any top yet
		top=-1;
	}
	public void push (Object item)
	{
		 if(isFull()) {
			 System.out.println("stack ful");
			 return;
		 }
		 else
		 {
			 top = top +1;
			 ArrayStack [top] = item;
		 }
	}
	public T pop ()
	{
		if(isEmpty()) {
			System.out.println("stack empty");
			return null;
		}
		else
		{
			T topOfStack =(T) ArrayStack[top];
			top = top-1;
			return topOfStack;
		}
	}
	public Boolean isFull()
	{
		return (top==size-1);
// 		COMMENTED OUT BECAUSE O(n) instead of O(1)
//		for (int i=0; i<ArrayStack.length;  ) {
//			if (ArrayStack[i] == null) return true;
//			else return false;
//		}
//		return false;
	}
	public Boolean isEmpty() {
		return (top == -1); 
	}
	public static void main(String [] args) {
		StackArray<Integer> st=  new StackArray <Integer> (5);
		st.push(5);
		st.push(56);
		st.push(2);
		st.push(7);
		st.push(3);
		
		while (!st.isEmpty()) {
			System.out.println(st.pop());
		}

	}
}
