package section11_LinkedList.lecture_83_97;



public class LinkedListInsert {
	
	private ListNode head;//Instance variable.
	
	private static class ListNode{
	private int data;//data property.
	private ListNode next;//pointer to next node.
	
	public ListNode(int data) {//Constructor 
		this.data = data;
		this.next = null;
		}
	}
	
	
	
	///To find the length of of linked list
	public int length() {
			if(head == null){
			return 0;
		}
			int count = 0;
			ListNode current = head;
			while(current != null) {
				count++;
				current = current.next; 	
		}
			return count;
	}		
	
	
	//For insertion at the begining.
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next=head;
		head = newNode;
	}
	
	//Inerstion at end
	public void insertEnd(int value) {
		ListNode newNode = new ListNode(value);
		if(head == null) {
			head = newNode;
			return;
		}
		ListNode current = head;
		while(null != current.next) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	//For Display Purpose
	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data+"--->");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListInsert sll = new LinkedListInsert(); //Intialize the value
		sll.head = new ListNode(1); //1
		ListNode second = new ListNode(2); 	//1-->2
		ListNode third = new ListNode(3); 	//1-->2-->3
		ListNode fourth = new ListNode(4);	//1-->2-->3-->4
		ListNode fifth = new ListNode(5); 	//1-->2-->3-->4-->5-->null
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next=fifth;
		
		sll.display();
		System.out.println("Length(number of node) is ---> "+sll.length());
		
		System.out.println("-------------------------------------------------------");
		
		sll.insertFirst(0);
		sll.display();
		System.out.println("Length(number of node) is ---> "+sll.length());
		
		System.out.println("-------------------------------------------------------");
		
		sll.insertEnd(6);
		sll.display();
		System.out.println("Length(number of node) is ---> "+sll.length());
		
	}

}
