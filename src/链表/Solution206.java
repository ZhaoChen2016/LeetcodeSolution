package 链表;

/**
 * creat by zhaochen on 2018/5/20 17:33
 */
public class Solution206 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        ListNode next = null;
        while (cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


    public ListNode reverseList2(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
//        ListNode next = null;
        while (cur != null){
            ListNode temp = cur.next;
            pre.next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

}
