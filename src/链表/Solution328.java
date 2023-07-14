package 链表;

/**
 * creat by zhaochen on 2018/5/20 23:42
 */
public class Solution328 {
       public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
    public ListNode oddEvenList(ListNode head) {
           ListNode dummy1 = new ListNode(0);//一个虚拟头节点
           ListNode dummy2 = new ListNode(0);
           ListNode cur1 = dummy1;
           ListNode cur2 = dummy2;
           int i = 1;
           while (head != null){
               if (i % 2 != 0){
                   cur1.next = head;
                   cur1 = head;
               }else {
                   cur2.next = head;
                   cur2 = head;
               }
               head = head.next;
               i++;
           }
           cur1.next = dummy2.next;
           cur2.next = null;
           return dummy1.next;

    }
}
