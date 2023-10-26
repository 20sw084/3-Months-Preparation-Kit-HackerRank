public class ApnaQueue {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    class Queue{
        static Node head= null;
        static Node tail =null;
        public static boolean isEmpty(){
            return head==null&tail==null;
        }

        public void add(int data){
            Node p = new Node(data);
            if(tail==null){
                tail=head=p;
                return;
            }
            tail.next=p;
            tail=p;
        }

         public int remove(){
            if (isEmpty()) {
                System.out.println("Empty Queue");
            }
            int front = head.data;
            head=head.next;
            return front;
         }

         public int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
            }
            return head.data;
         }
    }
}
