package 链表.双指针技术;

import java.util.HashMap;

/**
 * creat by zhaochen on 2018/5/21 18:03
 */
public class Solution143 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /*public void reorderList(ListNode head) {
        ListNode node1 = head;
        ListNode node2 = head;
        while (node2!=null && node2.next!=null && node2.next.next!=null){
            node1 = node1.next;
            node2 = node2.next.next;
        }
        ListNode pre = null;
        ListNode cur = node1.next;
        ListNode next = null;
        while (cur!=null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        node1.next = pre;
       *//* ListNode dummyHead = head;
        cur = null;
        next = null;
        while (dummyHead != null){
            cur = dummyHead.next;
            next = pre.next;
            if (cur == null || next == null)
                break;
            dummyHead.next = pre;
            pre.next = cur;
            dummyHead = cur;
            pre = next;
        }*//*
       merge(head,pre);
    }
    void merge(ListNode l1, ListNode l2) {
        while (l1 != null) {
            ListNode n1 = l1.next, n2 = l2.next;
            l1.next = l2;

            if (n1 == null)
                break;

            l2.next = n1;
            l1 = n1;
            l2 = n2;
        }*/
    public void reorderList(ListNode head) {

        HashMap<Integer,ListNode> nodeMap = new HashMap<Integer,ListNode> ();
        int len = 0 ;
        ListNode p = head ;

        while (p != null) {
            nodeMap.put(len++, p);
            p = p.next ;
        }

        int i = 0 ;
        int j = len - 1 ;
        for (; i < j - 1 ; ++i ,--j) {
            ListNode tmp = nodeMap.get(i).next ;
            nodeMap.get(i).next = nodeMap.get(j);
            nodeMap.get(j).next = tmp ;
            nodeMap.get(j - 1).next = null;
        }
    }
}
