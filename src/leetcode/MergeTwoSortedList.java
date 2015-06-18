package leetcode;

public class MergeTwoSortedList {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode pointer1, pointer2 = new ListNode(0);
        if (l1.val > l2.val){
            swap(l1, l2);
        }
        pointer1 = l1;
        while (l1 != null){
            if (l1.val <= l2.val){
                pointer2.next = l1;
                l1 = l1.next;
                pointer2 = pointer2.next;
            }
            else{
                pointer2.next = l2;
                swap(l1, l2);
            }
        }
        pointer2.next = l2;
        return pointer1;
    }
    private void swap(ListNode l1, ListNode l2){
        ListNode temp = l1;
        l1.val = l2.val;
        l1.next = l2.next;
        l2.val = temp.val;
        l2.next = temp.next;
    }
    //test
    public static void main(String[] args){
    	MergeTwoSortedList solution = new MergeTwoSortedList();
    	ListNode l1 = new ListNode(5);
    	ListNode l2 = new ListNode(1);
    	l2.next = new ListNode(2);
    	l2.next = new ListNode(3);
    	l2.next = new ListNode(4);
    	ListNode head = solution.mergeTwoLists(l1, l2);
    	System.out.println(head.val);
    	System.out.println(head.next.val);
    	System.out.println(head.next.next.val);
    	System.out.println(head.next.next.next.val);
    	System.out.println(head.next.next.next.next.val);


    }
}
