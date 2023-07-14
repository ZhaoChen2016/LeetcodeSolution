package 查找.和为XX;

import java.util.ArrayList;

/**
 * creat by zhaochen on 2018/4/4 12:55
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        int value = l1.val + l2.val;
        ListNode result = new ListNode(value % 10);
        result.next = addTwoNumbers(l1.next, l2.next);
        if (value >= 10) {
            result.next = addTwoNumbers(new ListNode(value / 10), result.next);
        }
        return result;
    }


    public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }
}
