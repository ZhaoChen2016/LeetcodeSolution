package 链表;

public class Solution445 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next){this.val = val; this.next = next;}
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        ListNode dummy = new ListNode();
        ListNode head = dummy;
        int carry = 0;
        while (l1 != null || l2 != null){
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            carry = sum - 10 >= 0 ? 1 : 0;
            int value = sum - 10 >= 0 ? sum - 10 : sum;
            ListNode node = new ListNode(value);
            dummy.next = node;
            dummy = dummy.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0){
            dummy.next = new ListNode(carry);
        }
        head = reverseList(head.next);
        return head;
    }

    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
