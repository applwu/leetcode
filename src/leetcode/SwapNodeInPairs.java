package leetcode;

public class SwapNodeInPairs {
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) return head;
		ListNode cur = head;
		head = head.next;
		ListNode p;
		while (cur.next != null){
			p = cur.next.next;
			cur.next.next = cur;
			if (p == null){
				cur.next = p;
				break;
			}
			else if (p.next == null){
				cur.next = p;
				break;
			}
			else{
				cur.next= p.next;
			}
			cur = p;
		}
		return head;
	}
	
	
    public ListNode swapPairs2(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode newHead = new ListNode(-1);
        ListNode pre = newHead;
        ListNode curr = head;
        while(curr != null && curr.next != null){
            ListNode temp = curr.next.next;
            pre.next = curr.next;
            pre = pre.next;
            pre.next = curr;
            curr.next = null;
            pre = pre.next;
            curr = temp;
        }
        if(curr != null)
            pre.next = curr;
        return newHead.next;    
    }
}
