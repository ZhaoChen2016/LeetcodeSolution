package 链表;

/**
 * creat by zhaochen on 2018/5/21 15:39
 */
public class Solution237 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public void deleteNode(ListNode node) {//没有之前的节点 这种情况可以换值
        node.val = node.next.val;
        node.next = node.next.next;
        return;

    }
}
