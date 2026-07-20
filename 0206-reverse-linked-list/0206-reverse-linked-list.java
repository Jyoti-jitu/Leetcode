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
 import java.util.Collections;
class Solution {
    public ListNode reverseList(ListNode head) {
       LinkedList<Integer> ne = new LinkedList<>();
       ListNode temp= head;
        while(temp!= null){
            ne.add(temp.val);
            temp= temp.next;
        } 
        Collections.reverse(ne);
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for(int val:ne){
            current.next= new ListNode(val);
            current= current.next;
        }
        return dummy.next;

    }
}