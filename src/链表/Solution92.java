package 链表;

/**
 * creat by zhaochen on 2018/5/20 19:02
 */
public class Solution92 {

    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre1 = null;
        ListNode start = dummy;
        for (int i = 0; i < m; i++){
            pre1 = start;
            start = start.next;
        }
        ListNode pre = pre1;
        ListNode cur = start;
        ListNode next = null;
        for (int i = m; i <= n; i++){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        start.next = cur;
        pre1.next = pre;
        return dummy.next;


    }


    public ListNode reverseBetween1(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        //first part
        ListNode cur1 = dummy;
        ListNode pre1 = null;
        for(int i=0;i<m;i++){
            pre1 = cur1;
            cur1 = cur1.next;
        }

        //reverse
        ListNode cur2 = cur1;
        ListNode pre2 = pre1;
        ListNode q2;
        for(int i=m;i<=n;i++){
            q2 = cur2.next;
            cur2.next = pre2;
            pre2 = cur2;
            cur2 = q2;
        }

        //connect
        pre1.next = pre2;
        cur1.next = cur2;

        return dummy.next;
    }
}
