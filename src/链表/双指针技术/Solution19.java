package 链表.双指针技术;

import 链表.Solution24;

/**
 * creat by zhaochen on 2018/5/21 16:37
 */
public class Solution19 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode last = dummyHead;
        for (int i = 0; i <= n; i++){
            last = last.next;
        }
        while (last != null){
            pre = pre.next;
            last = last.next;
        }
        pre.next = pre.next.next;
        return dummyHead.next;
    }
}
