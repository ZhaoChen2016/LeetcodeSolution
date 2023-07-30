package top100.List;

public class Solution234 {
    public static boolean isPalindrome(ListNode head) {
        ListNode node1 = head;
        ListNode node2 = head;
        while (node2 != null && node2.next != null){
            node1 = node1.next;
            node2 = node2.next.next;
        }
        ListNode end = reverseNode(node1);
        while (head != null && end != null){
            if (head.val == end.val) {
                head = head.next;
                end = end.next;
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static ListNode reverseNode(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(2);
        list2.next.next.next = new ListNode(1);
        isPalindrome(list2);
    }
}
