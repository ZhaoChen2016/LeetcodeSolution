package 链表;

/**
 * creat by zhaochen on 2018/5/20 20:34
 */
public class Solution83 {
     public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
   }

    public ListNode deleteDuplicates(ListNode head) {
         ListNode node = head;
         while (node != null && node.next != null){
             if (node.val != node.next.val)
                 node = node.next;
             else
                 node.next = node.next.next;
         }

         return head;
    }
}
