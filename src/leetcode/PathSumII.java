package leetcode;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
import java.util.Stack;
public class PathSumII {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
		if (root == null)
			return res;
		Stack<Integer> path = new Stack<Integer>();
		DFS(res, path, root, sum);
		return res;
	}
	public void DFS(LinkedList<List<Integer>> res, Stack<Integer> path, TreeNode root, int sum){
		if (root.left == null && root.right == null && root.val == sum){
			path.push(sum);
			Stack<Integer> copy = (Stack<Integer>)path.clone();
			res.add(copy);
			//System.out.println(res.toString());
			return;
		}
		path.push(root.val);
		//System.out.println(path.toString());
		if (root.left != null){
			DFS(res, path, root.left, sum - root.val);
			path.pop();
			//System.out.println(path.toString());
		}
		if (root.right != null){
			DFS(res, path, root.right, sum - root.val);
			path.pop();
			//System.out.println(path.toString());
		}
	}
	public static void main(String[] args){
		PathSumII solution = new PathSumII();
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right = new TreeNode(8);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.left = new TreeNode(5);
		root.right.right.right = new TreeNode(1);
		int sum = 22;
		System.out.println(solution.pathSum(root, sum).toString());
	}
}

