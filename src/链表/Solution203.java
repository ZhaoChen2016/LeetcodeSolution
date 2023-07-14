package 链表;

/**
 * creat by zhaochen on 2018/5/21 14:45
 */
public class Solution203 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode removeElement(ListNode head,int val){
        ListNode dummy = new ListNode(0);//可以删除头结点
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null){
            if (cur.next.val == val){
                cur.next = cur.next.next;
            }else
                cur = cur.next;
        }

        return dummy.next;
    }
}
