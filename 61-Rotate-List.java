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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
     ListNode tail = head;
     int count = 1;
     while(tail.next!=null){
        count++;
        tail= tail.next;
     }
     if(k%count==0) return head;
     k = k%count;
     tail.next = head;
    ListNode prev = head;
    int start = count -k;
    for(int i =1;i<start;i++){
        prev = prev.next;
    }
     
     head = prev.next;
     
     prev.next=null;

     return head;

    }
}