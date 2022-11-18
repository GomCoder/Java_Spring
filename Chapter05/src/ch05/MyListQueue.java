package ch05;

interface IQueue{
	public void enQueue(String data);
	public String deQueue();
	public void printAll();
}


public class MyListQueue extends MyLinkedList implements IQueue{
	MyListNode front;
	MyListNode rear;
	
	public MyListQueue() {
		front = null;
		rear = null;
	}
	
	public void enQueue(String data) {
		MyListNode newNode;
		
		if(isEmpty()) {
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		} else {
			newNode = addElement(data);
			rear = newNode;
		}
		System.out.println(newNode.getData() + " added");
	}

	public String deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		}
		String data = front.getData();
		front = front.next;
		
		if(front == null) {
			rear = null;
		}
		return data;		
	}
	
	public void printAll() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		
		MyListNode temp = front;
		
		while(temp != null) {
			System.out.println(temp.getData() + ", ");
			temp = temp.next;
		}
		
		System.out.println();
	}	
}
