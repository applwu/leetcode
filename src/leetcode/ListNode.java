package leetcode;


public class ListNode implements Comparable<ListNode>{
	 int val;
	 ListNode next;
	 ListNode(int x) {
	     val = x;
	     next = null;
	 }
     @Override
     public int compareTo(ListNode another){
         if (val < another.val) return -1;
         else if (val > another.val) return 1;
         else return 0;
     }
}