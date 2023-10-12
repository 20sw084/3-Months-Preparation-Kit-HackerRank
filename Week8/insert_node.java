class DoublyLinkedListNode {
    int data;
    DoublyLinkedListNode next;
    DoublyLinkedListNode prev;

    public DoublyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class insert_node {
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);

        if (head == null) {
            // If the list is empty, set the new node as the head.
            return newNode;
        }

        if (data < head.data) {
            // If the new data is smaller than the head's data, insert at the beginning.
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }

        DoublyLinkedListNode current = head;

        while (current.next != null && current.next.data < data) {
            current = current.next;
        }

        if (current.next == null) {
            // If the new data is the largest, insert at the end.
            current.next = newNode;
            newNode.prev = current;
        } else {
            // Insert the new data in the middle.
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        return head;
    }

    static void printDoublyLinkedList(DoublyLinkedListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    public static void main(String[] args) {
        // Example usage
        DoublyLinkedListNode head = null;
        
        int[] data = {1, 3, 4, 10};
        for (int value : data) {
            head = sortedInsert(head, value);
        }
        
        int newData = 5;
        head = sortedInsert(head, newData);
        printDoublyLinkedList(head);
    }
}
