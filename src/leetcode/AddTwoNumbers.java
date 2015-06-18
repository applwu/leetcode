package leetcode;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode l3 = new ListNode(0);
		l3.val = l1.val + l2.val;
		if (l3.val >= 10){
			l3.val -= 10;
			l3.next = new ListNode(1);
		}
		ListNode p1 = l1, 
				 p2 = l2,
				 p3 = l3;
		while (p1.next != null || p2.next != null){
			if (p3.next == null){
				p3.next = new ListNode(0);
				if (p1.next == null)
					p3.next.val = p2.next.val;
				else if (p2.next == null)
					p3.next.val = p1.next.val;
				else
					p3.next.val = p1.next.val + p2.next.val;
				
				if (p3.next.val >= 10){
					p3.next.val -= 10;
					p3.next.next = new ListNode(1);
				}
			}
			else{
				if (p1.next == null)
					p3.next.val += p2.next.val;
				else if (p2.next == null)
					p3.next.val += p1.next.val;
				else
					p3.next.val += p1.next.val + p2.next.val;
				if (p3.next.val >= 10){
					p3.next.val -= 10;
					p3.next.next = new ListNode(1);
				}
			}
			if (p1.next != null)
				p1 = p1.next;
			if (p2.next != null)
				p2 = p2.next;
			p3 = p3.next;
		}
		return l3;
    }
	//test
	public void test(ListNode l1, ListNode l2){
		ListNode l3 = addTwoNumbers(l1, l2);
		while (l3 != null){
			System.out.println(l3.val);
			l3 = l3.next;
		}
	}
	public static void main(String[] args){
		ListNode l1 = new ListNode(0);
		//l1.next = new ListNode(4);
		//l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(8);
		//l2.next.next = new ListNode(4);
		AddTwoNumbers solution = new AddTwoNumbers();
		solution.test(l1, l2);
	}
}
