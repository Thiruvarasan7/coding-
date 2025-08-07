package com.palle;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue m=new MyQueue(5);
		m.enQueue(10);
		m.enQueue(20);
		m.enQueue(30);
		m.enQueue(40);
		m.enQueue(50);
		//int element=m.dequeue();
		//System.out.println(element);
		System.out.println(m.peek());
		System.out.println(m.size());
		m.display();
		
	}

}
class MyQueue{
	int []queue;
	int front;
	int rear;
	int capacity;
	private boolean isFull;
	public MyQueue(int capacity) {
		this.queue=new int [capacity];
		front=rear=0;
		this.capacity=capacity;
	}
	public void enQueue(int element) {
		if(this.isFull==true) {
			System.out.println("queue is full try later");
			return;
		}
		queue[rear++]=element;
		System.out.println("added emelent "+element+"sucess");
	}
	public int dequeue() {
		if(isEmpty()==true) {
			System.out.println("is empty");
			return-1;
		}
		int element=queue[front++];
		return element;
	}
	
	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(front==rear) {
			return true;
		}
		return false;
	}
	public boolean isFull() {
		if(rear==capacity) {
			return true;
		}
		return false;
	}
	public int peek() {
		if(isEmpty()==true) {
			return-1;
		}
		return queue[front];
	}
	public int size() {
		return rear-front;
	}
	public void display() {
		for(int i=front;i<rear;i++) {
			System.out.print(queue[i]+" ");
		}
	}
	
}


