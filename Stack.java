package com.palle;

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack m=new MyStack(5);
		m.push(100);
		m.push(200);
		m.push(300);
		m.push(300);
		m.push(300);
		m.dispaly();
		System.out.println(m.isFull());
		System.out.println(m.peek());
		int element =m.pop();
		System.out.println(element);
	}

}
class MyStack{
	private int[]stack;
	private int top;
	private int capacity;
	public MyStack(int capacity) {
		this.stack=new int[capacity];
		this.top=-1;
		this.capacity=capacity;
	}
	public void push(int element) {
		if(top==capacity-1) {
			System.out.println("stack overflow");
		}
		stack[++top]=element;
		System.out.println("element inserted "+element);
	}
	public int pop(){
		if(isEmpty()==true) {
			System.out.println("stack underflow");
			return-1;
		}
		int element=stack[top--];
		return element;
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		if(top ==- 1) {
			return true;
		}
		return false;
	}
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return stack[top];
	}
	public boolean isFull() {
		if(top == capacity - 1) {
			return true;
		}
		return false;
		 
	}
	public int size() {
		return top + 1;
	}
	public void dispaly() {
		for(int i=0;i<top;i++) {
			System.out.print(stack[i]+" ");
		}
	}
}
