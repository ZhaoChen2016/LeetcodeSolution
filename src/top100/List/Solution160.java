package top100.List;
//找到链表相交的节点
public class Solution160 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node1 = headA;
        ListNode node2 = headB;
        while (headA != null && headB != null){
            headA = headA.next;
            headB = headB.next;
        }
        if (headA == null){
            headA = node2;
        }
        if (headB == null){
            headB = node1;
        }
        while (headA != null && headB != null){
            headA = headA.next;
            headB = headB.next;
        }
        if (headA == null){
            headA = node2;
        }
        if (headB == null){
            headB = node1;
        }
        while (headA != null && headB != null){
            headA = headA.next;
            headB = headB.next;
            if (headA == headB) {
                return headA;
            }
        }
        return null;
    }

    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB){
            pA = pA.next != null ? pA.next : headB;
            pB = pB.next != null ? pB.next : headA;
        }
        return pA;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        list2.next.next.next = new ListNode(6);
        getIntersectionNode(list1, list2);
    }
}
