package section11_LinkedList.lecture_83_97;

public class LinkedListNode {
	
	private LinkedList head;
	
	private static class LinkedList{
		private int data;
		private LinkedList next;
		
		public LinkedList(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void display() {
		LinkedList current = head;
		while(current != null) {
			System.out.print(current.data+" ---> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public int length() {
		if(head == null) {
			return 0;
		}
		int count = 0;
		LinkedList current = head;
		while(current != null){
			count++;
			current = current.next;
		}
		return count;
	}
	//----------------------------------------------------------
	
	public void insertAnyNode(int position, int value) {
		LinkedList node = new LinkedList(value);
		if(position == 1) {
			node.next = head;
			head = node;
		}else {
		LinkedList previous = head;
		int count = 1;
		while(count < position - 1) {
			previous = previous.next;
			count++;
		}
		
		LinkedList current = previous.next;
		previous.next = node;
		node.next = current;
		}
	}
	//----------------------------------------------------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListNode abc = new LinkedListNode();
		abc.head = new LinkedList(1);
		LinkedList second = new LinkedList(2);
		LinkedList third = new 	LinkedList(3);
		LinkedList fourth = new LinkedList(4);
		LinkedList fifth = new 	LinkedList(5);
		
		abc.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		abc.display();
		System.out.println("Length of given node:- "+abc.length());
		System.out.println("---------------------------------------------------");
		
		abc.insertAnyNode(6, 7);
		abc.insertAnyNode(7, 8);
		abc.display();
		System.out.println("Length of given node:- "+abc.length());
		System.out.println("---------------------------------------------------");
		
	}

}
