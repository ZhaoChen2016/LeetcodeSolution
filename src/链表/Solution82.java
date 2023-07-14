package 链表;

/**
 * creat by zhaochen on 2018/5/23 11:02
 */
public class Solution82 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode cur = pre.next;
        while (cur!=null){
            while (cur != null && cur.next != null && cur.val == cur.next.val){
                cur = cur.next;
            }
            if (pre.next == cur){
                pre = pre.next;
            }else {
                pre.next = cur.next;
            }
            cur = cur.next;
        }
        return dummyHead.next;
        }

    }

