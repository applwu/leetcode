package leetcode;

public class RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head.next == null)
			return null;
        ListNode p0 = new ListNode(0);
        p0.next = head;
        ListNode p1 = head;
        if (n > 1){
        	for (int i = 0; i < n; i++){
        		p1 = p1.next;
        	}
        }
        while (p1.next != null){
        	p0 = p0.next;
        	p1 = p1.next;
        }
        //check if head has been removed
        if (p0.next == head)
            return p0.next.next;
        else {
        	p0.next = p0.next.next;
        	return head;
        }
    }
}
