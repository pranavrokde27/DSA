package section11_LinkedList.lecture_83_97;

public class LinkedInsertion {
	
	public class Node{
		public int value;
		public Node next;//pointer
	}
	
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
		size=1;
		return head;		
	}
	
	public void insertInLinkedList(int nodeValue, int location) {
		Node node = new Node();
		node.value = nodeValue;
		if(head == null) {
			createLinkedList(nodeValue);
			return;
		}else if(location == 0){
			node.next = head;
			head = node;
		}else if(location >= size) {
			node.next = null;
			tail.next = node;
			tail = node;
		}else {
			Node tempNode = head;
			int index = 0;
			while(index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			Node nextNode = tempNode.next;
			tempNode.next = node;
			node.next = nextNode;
		}
		size ++;
	}
	
	public static void main(String[] args) {
		LinkedInsertion link = new LinkedInsertion();
		link.createLinkedList(5);
		System.out.println(link.head.value);
		link.insertInLinkedList(6, 0);
		link.insertInLinkedList(4, 1);
		
		System.out.println(link.head.value);
	}
}
