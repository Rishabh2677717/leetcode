/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode mergeTwo(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        if (list1.val > list2.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }

        ListNode result = list1;
        ListNode temp = null;
        while (list1 != null && list2 != null) {

            while (list1 != null && list1.val <= list2.val) {
                temp = list1;
                list1 = list1.next;
            }
            temp.next = list2;
            ListNode temp1 = list1;
            list1 = list2;
            list2 = temp1;
        }
        return result;
    }
 private ListNode mergeRange(
            ListNode[] lists, int left, int right) {

        // Base case: only one list
        if (left == right) {
            return lists[left];
        }

        int mid = left + (right - left) / 2;

        // Recursively merge the left half
        ListNode first = mergeRange(lists, left, mid);

        // Recursively merge the right half
        ListNode second = mergeRange(lists, mid + 1, right);

        // Merge both sorted results
        return mergeTwo(first, second);
    }
    public ListNode mergeKLists(ListNode[] lists) {
       
        if (lists == null || lists.length == 0) {
            return null;
        }

        return mergeRange(lists, 0, lists.length - 1);
    }
}