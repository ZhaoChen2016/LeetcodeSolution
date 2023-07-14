package 链表;

/**
 * creat by zhaochen on 2018/5/20 21:24
 */
public class Solution86 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode cur1 = dummy1;
        ListNode cur2 = dummy2;
        while (head != null){
            if (head.val < x){
                cur1.next = head;
                cur1 = head;
            }else {
                cur2.next = head;
                cur2 = head;
            }
            head = head.next;
        }

        cur1.next = dummy2.next;
        cur2.next = null;//避免形成循环 cur2 = head;head这个元素可能会有next元素 这时会形成循环
        return dummy1.next;

    }
}
