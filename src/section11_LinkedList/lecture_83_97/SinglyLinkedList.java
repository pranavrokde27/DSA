package section11_LinkedList.lecture_83_97;

//Dinesh viryani youtube

public class SinglyLinkedList {
	
	private ListNode head;
	
	private static class ListNode{
		private int data; // any generic type
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next= null;
		}
	}
	
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
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.head = new ListNode(10); //10
		ListNode second = new ListNode(1); //10-->1
		ListNode third = new ListNode(8);  //10-->1-->8
		ListNode fourth = new ListNode(11);//10-->1-->8-->11-->null 
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		sll.display();
		
	}

}
