
// Definition for singly-linked list.

public class Solution {
	public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    }
	
	public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
        	return head;
        
        ListNode cur = new ListNode(0);
        cur.next = head;
        ListNode dummy = cur;
        
        while(head != null && head.next != null){
        	ListNode node1 = head;
        	ListNode node2 = head.next.next;
        	cur.next = head.next;
        	cur = cur.next;
        	cur.next = node1;
        	node1.next = node2;
        	cur = cur.next;
        	head = node2;
        }
        
        return dummy.next;
    }
}
