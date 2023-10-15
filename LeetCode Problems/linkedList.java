public class homework {
    static class Node {
        String data;
        Node next;
    }
    static Node insert(Node head, String item) {
        Node temp = new Node();
        Node ptr;
        temp.data = item;
        temp.next = null;
        if (head == null)
            head = temp;
        else {
            ptr = head;
            while (ptr.next != null)
                  ptr = ptr.next;
            ptr.next = temp;
        }
        return head;
    }
    static Node arrayToList(String []arr, int n) {
        Node head = null;
        for (int i = 0; i < n; i++)
            head = insert(head, arr[i]);
        return head;
    }
    static void display(Node head) {
        while (head != null) {
            System.out.print( head.data + "->");
            head = head.next;
        }
        System.out.println();
    }
    static void count (Node head){
        int counting = 1;
        int flag = 0;
        System.out.println(counting);
        Node p = head;
        Node q = head;
        for(p = head ; p.next != null ; p = p.next){
            counting = 0;
            //flag = 0;
            for(q = p.next ; q.next != null ; q = q.next){
                if(p.data.equals(q.data)){
                    counting++;
                }
            }
            System.out.println(p.data+"=="+counting);
        }
    }
    public static void main(String[] args) {
        String s = "i love my university i have been studying in this university since last 12 months and those months are the best part of my life the uni is providing application to strengthen my skills and make a way for my better future i will be keep loving my uni for the rest of my life";
        String []words  = s.split("\\W+");
        System.out.println(words.length);
        int n = words.length;
        Node head = arrayToList(words, n);
        display(head);
        count(head);
    }
}