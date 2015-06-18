package leetcode;

public class MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
		 if (root == null) {
		        return 0;
		    }
		 return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}
	
	public static void main(String[] args){
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		root.right.right.left = new TreeNode(5);
		root.right.right.right = new TreeNode(1);
		MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();
		System.out.println(solution.maxDepth(root));
	}
}
