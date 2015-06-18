package leetcode;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.List;
import java.util.Queue;
public class MergeKSortedLists {
	public ListNode mergeKLists(List<ListNode> lists) {
		if (lists.size() == 0) return null;
		Queue<ListNode> pq = new PriorityQueue<ListNode>();
		for (int i = 0; i < lists.size(); i++){
			if (lists.get(i) != null)
				pq.add(lists.get(i));
		}
		ListNode head = pq.poll();
		if (head.next != null)
			pq.add(head.next);
		ListNode current = head;
		while (!pq.isEmpty()){
			current.next = pq.poll();
			current = current.next;
			if (current.next != null)
				pq.add(current.next);
		}
		return head;
	}
    
	//test
	public static void main(String[] args){
		MergeKSortedLists solution = new MergeKSortedLists();
		List<ListNode> lists = new ArrayList<ListNode>();
		List<ListNode> lists2 = new ArrayList<ListNode>();
		ListNode l1 = null;
		ListNode l2 = new ListNode(6);
		l2.next = new ListNode(33);
		l2.next.next = new ListNode(154);
		ListNode l3 = new ListNode(3);
		l3.next = new ListNode(7);
		ListNode l4 = new ListNode(4);
		l4.next = new ListNode(6);
		l4.next.next = new ListNode(12);
		ListNode l5 = new ListNode(3);
		l5.next = new ListNode(5);
		l5.next.next = new ListNode(8);
		l5.next.next.next = new ListNode(9);
		lists.add(l1);
		lists.add(l2);
		lists.add(l3);
		lists.add(l4);
		lists.add(l5);
		ListNode head = solution.mergeKLists(lists);
		while(head != null){
			System.out.println(head.val);
			head = head.next;
		}
	}

}
