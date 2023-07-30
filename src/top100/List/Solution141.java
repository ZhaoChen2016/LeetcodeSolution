package top100.List;

public class Solution141 {
    public boolean hasCycle(ListNode head) {
        ListNode node1 = head.next;
        ListNode node2 = null;
        if (head.next != null) {
            node2 = head.next.next;
        }
        while (node1 != null && node2 != null){
            if (node1 == node2){
                return true;
            }
            node1 = node1.next;
            if (node2.next != null){
                node2 = node2.next.next;
            }else {
                return false;
            }
        }

        while (node2.next != null && node2.next.next != null){
            node1 = node1.next;
            node2 = node2.next.next;
            if (node1 == node2){
                return true;
            }
        }
        return false;
    }

    //快慢指针解法
    public static boolean hasCycle2(ListNode head) {
        ListNode node1 = head;
        ListNode node2 = head;
        while (node2 != null && node2.next != null){
            node1 = node1.next;
            node2 = node2.next.next;
            if (node1 == node2){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode list2 = new ListNode();
        hasCycle2(list2);
    }

}
