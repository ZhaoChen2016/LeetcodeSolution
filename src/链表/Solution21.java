package 链表;

/**
 * creat by zhaochen on 2018/5/23 11:36
 */
public class Solution21 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(0);
        ListNode dummy = newHead;
        while (l1 != null || l2 != null){
            while (l1 != null && l2 != null && l1.val < l2.val){
                newHead.next = l1;
                l1 = l1.next;
                newHead = newHead.next;
            }
            while (l1 != null && l2 != null && l1.val >= l2.val ){
                newHead.next = l2;
                l2 = l2.next;
                newHead = newHead.next;
            }
            while (l1 == null && l2 != null){
                newHead.next = l2;
                l2 = l2.next;
                newHead = newHead.next;
            }
            while (l2 == null && l1 != null){
                newHead.next = l1;
                l1 = l1.next;
                newHead = newHead.next;
            }
        }
        return dummy.next;

    }
}
