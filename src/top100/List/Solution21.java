package top100.List;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class Solution21 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode();
        ListNode prev = dummyNode;
        while (true){
            while (list1 != null && ((list2 != null && list1.val < list2.val) || list2 == null) ) {
                dummyNode.next = list1;
                dummyNode = dummyNode.next;
                list1 = list1.next;
            }
            while (list2 != null && ((list1 != null && list1.val >= list2.val) || list1 == null)) {
                dummyNode.next = list2;
                dummyNode = dummyNode.next;
                list2 = list2.next;
            }
            if (list1 == null && list2 == null) {
                break;
            }
        }
        return prev.next;
    }

    public static ListNode mergeTwoListsRecursive(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list1;
        }
        if (list2 == null){
            return list2;
        }
        if (list1.val < list2.val){
            list1.next = mergeTwoListsRecursive(list1.next, list2);
            return list1;
        }else {
            list2.next = mergeTwoListsRecursive(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        mergeTwoListsRecursive(list1,list2);
    }
}
