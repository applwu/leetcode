package leetcode;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode pointer, head;
		if (l1 == null) return l2;
		if (l2 == null) return l1;
		if (l1.val <= l2.val) head = l1;
		else head = l2;
		pointer = new ListNode(0);
		while (l1 != null && l2 != null){
			System.out.println(l1.val);
			System.out.println(l2.val);
			if (l1.val <= l2.val){
				pointer.next = l1;
				System.out.println("pointer" + pointer.val);
				l1 = l1.next;
				pointer = pointer.next;
				System.out.println("pointer" + pointer.val);
				if (l1 == null){
					System.out.println("l1 null");
					pointer.next = l2;
				}
			}
			else{
				System.out.println("pointer" + pointer.val);
				pointer.next = l2;
				System.out.println("pointer" + pointer.val);
				l2 = l2.next;
				pointer = pointer.next;
				System.out.println("pointer" + pointer.val);
				if (l2 == null){
					System.out.println("l2 null");
					pointer.next = l1;
				}
			}
		}
		return head;
    }
	//test
	public static void main(String[] args){
		MergeTwoSortedLists solution = new MergeTwoSortedLists();
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(1);
		ListNode head = solution.mergeTwoLists(l1, l2);
		int val = head.val;
		System.out.println(val);
	}
}
