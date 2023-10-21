package LeetcodeFirstMonth;

public class OddEvenLinkedList_328 {
    /*
    Runtime: 1 ms, faster than 36.14% of Java online submissions for Odd Even Linked List.
Memory Usage: 44.9 MB, less than 36.41% of Java online submissions for Odd Even Linked List.
     */

    //Try to solve it in constant space!!

    public static ListNode oddEvenList(ListNode head){

        ListNode subList1 = new ListNode(-1);
        ListNode subList2 = new ListNode(-1);

        ListNode ptr1 = subList1;
        ListNode ptr2 = subList2;

        int index = 1;

        for (ListNode node = head; node != null; node = node.next) {
            if(index % 2 == 0){
                ptr2.next = new ListNode(node.val);
                ptr2 = ptr2.next;
            }
            else {
                ptr1.next = new ListNode(node.val);
                ptr1 = ptr1.next;
            }
            index++;
        }
        //Connecting both sub lists (Odd & Even indiced)
        ptr1.next = subList2.next;

        return subList1.next;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        list.next.next.next.next.next = new ListNode(6);

        ListNode oddEven = oddEvenList(list);
        for (ListNode node = oddEven; node != null; node = node.next) {
            System.out.print(node.val + " ");
        }
    }
}
