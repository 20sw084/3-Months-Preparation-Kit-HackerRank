package linkedList;


public class DetectCycle {

    static class Node{
    	int data;
    	Node next;
    	Node(int data){
    		this.data = data;
    		next = null;
    	}
    }
    static Node head = null;
    
    static class LinkedList{
    	//method to insert the values
    	void insert(int value) {
    		Node newNode = new Node(value);
    		if(head == null) head = newNode;
    		else {
    			newNode.next = head;
    			head = newNode;
    		}
    	}
    	
    	//method to detect the loop in the given linked list using pointers
    	boolean detectLoop() {
    		Node slowPointer = head;
    		Node fastPointer = head;
    		while(slowPointer != null && fastPointer != null && fastPointer.next != null) {
    			slowPointer = slowPointer.next;
    			fastPointer = fastPointer.next.next;
    			if(slowPointer == fastPointer) return true;
    		}
    		return false;
    	}
    }
    
    public static void main(String[] args) {
    	
    	//creation of Linked List
    	LinkedList list = new LinkedList();
    	
    	//inserting the values for sample example
    	list.insert(10);
    	list.insert(20);
    	list.insert(30);
    	list.insert(40);
    	list.insert(50);
    	
    	//adding a loop for example
    	
    	Node temp = head;
    	while(temp.next != null)
    		temp = temp.next;
    	temp.next = head;
    	
    	//printing the result
    	if(list.detectLoop()) System.out.println("Loop exists in the given Linked List");
    	else System.out.println("Loop does not exists in the given Linked List");
    	
    }
}
