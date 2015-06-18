package leetcode;
import java.util.List;
import java.util.Stack;

public class BSTIterator {
	Stack<TreeNode> stack;
	
	public BSTIterator(TreeNode root) {
		stack = new Stack<TreeNode>();
		while (root != null){
			stack.push(root);
			root = root.left;
		}
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
    	int val = 0;
        if (hasNext()){
        	TreeNode cur = stack.pop();
        	val = cur.val;
        	cur = cur.right;
        	while (cur != null){
        		stack.push(cur);
        		cur = cur.left;
        	}
        }
        return val;
    }
}
