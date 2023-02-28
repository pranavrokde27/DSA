package practice;

public class SinglyLinkedList {
	
	private LinkedList head;
	
	private static class LinkedList{
		private String data;
		private LinkedList next;//variable
		
		public LinkedList(String data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void display() {
		LinkedList current = head;
		while(current != null) {
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	
	public int length() {
		if(head == null){
			return 0;
		}else {
			int count = 0;
			LinkedList current = head;
			while(current != null) {
				count++;
				current = current.next; 	
		}
			return count;
		}
	}
	
	public void insertFirst(String value) {
		LinkedList newNode  = new LinkedList(value);
		newNode.next = head;
		head = newNode;
		
	}
	

	public  void insertEnd(String value) {
		LinkedList newNode = new LinkedList(value);
		if(head == null) {
			newNode = head;
			return;
		}
		LinkedList current = head;
		while(null != current.next) {
			current = current.next;
		}
		current.next = newNode;
	}
	

	
	public void insertAtAnyNode(int position, String value) {
		LinkedList newNode = new LinkedList(value);
		if(position == 1){
			newNode.next = head;
			head = newNode;
		}else {
			LinkedList previous= head;
			int count = 1;
			while(count < position - 1) {
				previous = previous.next;
				count++;
			}
			LinkedList current = previous.next;
			previous.next = newNode;
			newNode.next = current;
		}
	}
	
	public LinkedList deleteFirstNode() {
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
		SinglyLinkedList abc = new SinglyLinkedList();
		
		abc.head = new LinkedList("PRANAV");
		LinkedList second = new LinkedList("NITIN");
		LinkedList third = new LinkedList("AJAY");
		LinkedList fourth = new LinkedList("Jay");
		LinkedList fifth = new LinkedList("Pradeep");
		
		abc.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		System.out.println("For Normal Display");
		abc.display();		
		System.out.println("Length of LinkedList:- "+abc.length());
		System.out.println("---------------------------------XXX---------------------------------");
		

		System.out.println("For Insertion Display at beganing");
		abc.insertFirst("MAV SIR");
		abc.display();
		System.out.println("Length of LinkedList:- "+abc.length());
		System.out.println("---------------------------------XXX---------------------------------");
		
		
		System.out.println("For Insertion Display at end");
		abc.insertEnd("Shubham");
		abc.display();
		System.out.println("Length of LinkedList:- "+abc.length());
		System.out.println("---------------------------------XXX---------------------------------");
		
		System.out.println("For Insertion Display at any position");
		abc.insertAtAnyNode(3,"SHANTAN");
		abc.display();
		System.out.println("Length of LinkedList:- "+abc.length());
		System.out.println("---------------------------------XXX---------------------------------");
		
		System.out.println("For Insertion Display at any position");
		abc.insertAtAnyNode(3,"SHANTANU");
		abc.insertAtAnyNode(2,"SANU");
		abc.insertAtAnyNode(3,"Rahul");
		abc.display();
		System.out.println("Length of LinkedList:- "+abc.length());
		System.out.println("---------------------------------XXX---------------------------------");
		
		System.out.println("For Delete  Display at any begning");
		System.out.println(abc.deleteFirstNode().data);
		abc.display();
		System.out.println("Length of LinkedList:- "+abc.length());
		System.out.println("---------------------------------XXX---------------------------------");
	}

}
