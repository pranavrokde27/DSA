package section11_LinkedList.lecture_83_97;

	public class LinkedListP {
		
		private ListNode head;
		
		private static class ListNode{
			private int data;
			private ListNode next;
			
			public ListNode(int data) {
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
			
			
		public void display() {
			ListNode current = head;
			while(current != null) {
				System.out.print(current.data+" ---> ");
				current = current.next;
			}
			System.out.println("null");
		}
		
		
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LinkedListP llp = new LinkedListP();
			llp.head = new ListNode(1);
			ListNode second = new ListNode(2);
			ListNode third = new ListNode(3);
			ListNode fourth = new ListNode(4);
			ListNode fifth = new ListNode(5);
			
			llp.head.next = second;
			second.next = third;
			third.next=fourth;
			fourth.next= fifth;
			
			llp.display();
			System.out.println("Length(number of node) is ---> "+llp.length());
			
			
			
		}
	
}
