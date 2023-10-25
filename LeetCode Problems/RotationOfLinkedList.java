/*
    PROBLEM STATEMENT:-
    Given the head of a linked list, rotate the list to the right by k places and return the head.

    E.G:
    LL:          1 -> 2 -> 3 -> 4 -> 5   K=2
    Rotation 1:  5 -> 1 -> 2 -> 3 -> 4
    Rotation 2:  4 -> 5 -> 1 -> 2 -> 3
*/


class Solution 
{
    public ListNode rotateRight(ListNode head, int k) 
    {
        //EDGE CASES
        //No nodes, one node, zero rotation
        if(head==null || head.next==null || k==0) return head;
        

        //general cases
        int len=1;
        ListNode curr=head;
        while(curr.next!=null)  // traverse to the end of the linked list
        {
            len++;
            curr=curr.next;
        }
        
        curr.next=head;  // make it a circular linked list by joining last node to first
        k=k % len;
        k=len-k;
        while(k>0)
        {
            curr=curr.next;
            k--;
        }
        
        head=curr.next;
        curr.next=null;
        
        return head;
    }
}


public class ListNode 
{
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}