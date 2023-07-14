package 链表.双指针技术;

/**
 * creat by zhaochen on 2018/5/21 16:49
 */
public class Solution61 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode rotateRight(ListNode head, int k) {
       int size = 1;
       ListNode dummyNode = head;
       if (head == null)
           return head;
       while (dummyNode.next != null){
           size++;
           dummyNode = dummyNode.next;
       }
       dummyNode.next = head;
       for (int i = 0; i < size - k % size - 1; i++){
           head = head.next;//前一个元素
       }
       dummyNode = head.next;
        head.next = null;
        return dummyNode;

    }
}
