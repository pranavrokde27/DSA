package section11_LinkedList.lecture_83_97;

public class Practice1 {
	
	private LinkedList head;
	
	private static class LinkedList{
		private int data;
		private LinkedList next;
		
		public  LinkedList(int data) {
			this.data=data;
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
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public void insertFirst(int value) {
		LinkedList newNode = new LinkedList(value);
		newNode.next = head;
		head = newNode;
	}
	
	public void insertEnd(int value) {
		LinkedList newNode = new LinkedList(value);
		if(head == null) {
			newNode = head;
			return ;
		}
		LinkedList current = head;
		while(null != current.next) {
				current = current.next;
			}
			current.next = newNode;
	}
	
	public LinkedList deleteFirst() {
		if(head == null) {
			return null;
		}
		LinkedList temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice1 abc = new Practice1();
		abc.head = new LinkedList(1);
		LinkedList second = new LinkedList(2);
		LinkedList third = new LinkedList(3);
		LinkedList fourth = new LinkedList(4);
		LinkedList fifth = new LinkedList(5);
		
		abc.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		abc.display();
		System.out.println("Length of the Linked List:- "+abc.length());
		System.out.println("-----------------------------------------------");
		
		
		abc.insertFirst(0);
		abc.display();
		System.out.println("Length of the Linked List:- "+abc.length());
		
		System.out.println("-----------------------------------------------");
		abc.insertEnd(6);
		abc.display();
		System.out.println("Length of the Linked List:- "+abc.length());
		
		System.out.println("-----------------------------------------------");
		System.out.println(abc.deleteFirst().data);
		abc.display();
		System.out.println("Length of the Linked List:- "+abc.length());
		
		
		System.out.println("-----------------------------------------------");
		System.out.println(abc.deleteFirst().data);
		abc.display();
		System.out.println("Length of the Linked List:- "+abc.length());


	}

}
