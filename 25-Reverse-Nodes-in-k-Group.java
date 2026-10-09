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
    public static ListNode kthNode(ListNode temp, int k){
k-=1;
while(temp!=null&&k>0){
    k--;
    temp = temp.next;
}
return temp;
    }
    public static ListNode reverse(ListNode temp){
        ListNode prev = null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev= temp;
            temp = front;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode kthNode = kthNode(temp,k);
            if(kthNode==null){
                if(prev!=null) prev.next = temp;
                break;
            }
            ListNode nextNode = kthNode.next;
            kthNode.next= null;
            reverse(temp);
            if(temp==head){
                head = kthNode;
            }
            else{
                prev.next= kthNode;
            }
            prev = temp;
            temp = nextNode;
        }
        return head;
    }
}