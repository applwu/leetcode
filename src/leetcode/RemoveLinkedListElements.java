package leetcode;

public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        while (current != null && current.val == val){
        	current = current.next;
        }
        head = current;
        if (head == null){
        	return head;
        }
        while (current != null){
        	while (current.next != null && current.next.val == val){
        			current.next = current.next.next;
        	}
        	current = current.next;
        }
        return head;
    }
	public static void main(String[] args){
		ListNode head = new ListNode(6);
		head.next = new ListNode(2);
		head.next.next = new ListNode(6);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next = new ListNode(6);
		RemoveLinkedListElements solution = new RemoveLinkedListElements();
		head = solution.removeElements(head, 6);
		if (head == null)
			System.out.println("null");
		while(head != null){
			System.out.println(head.val);
			head = head.next;
		}
	}
}
