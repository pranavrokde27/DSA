package section11_LinkedList.lecture_83_97;
//Creation of Singly List


public class LinkedList {
	
	//First step
	//Node class---> creating node class for reference.
	public class Node{
		public int value;
		public Node next; //next reference
	}
	
	//Second Step
	//Properties for creating head and tail.
	public Node head;
	public Node tail;
	public int size;
	
	public Node createLinkedList(int nodeValue) {
		head = new Node();
		Node node = new Node();//Instance
		node.next = null;
		node.value = nodeValue;
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList  sl = new LinkedList();
		sl.createLinkedList(5);
		System.out.println(sl.head.value);
	}

}
