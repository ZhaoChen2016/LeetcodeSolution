package 链表;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Solution142 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next){this.val = val; this.next = next;}
    }
    public ListNode detectCycle(ListNode head) {
        ListNode meet = findNode(head);
        if (meet == null)
            return null;
        ListNode third = head;
        while (meet != third){
            meet = meet.next;
            third = third.next;
        }
        return third;
    }

    public ListNode findNode(ListNode head){
        if (head == null || head.next == null)
            return null;
        ListNode first = head.next.next, second = head.next;
        while (first != second){
            if (first.next == null || first.next.next == null){
                return null;
            }
            first = first.next.next;
            second = second.next;
        }
        return first;
    }
}
