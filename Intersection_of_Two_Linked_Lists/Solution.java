package Intersection_of_Two_Linked_Lists;

import java.util.HashSet;

public class Solution {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode currA = headA;
        while (currA != null) {
            set.add(currA);
            currA = currA.next;
        }
        ListNode currB = headB;
        while (currB != null) {
            if (set.contains(currB)) {
                return currB;
            }
            currB = currB.next;
        }
    return null;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}
