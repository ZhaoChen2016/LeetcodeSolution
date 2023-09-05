package 链表;

public class Solution19 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next){this.val = val; this.next = next;}
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode first = head;
        ListNode second = dummy;
        while (n > 0){
            first = first.next;
            n--;
        }
        while (first != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
