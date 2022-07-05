package com.example;

/*
 * Given the root of a complete binary tree, return the number of the nodes in the tree. 
 * Design an algorithm that runs in less than O(n) time complexity.
 * 
 * Input: root = [1,2,3,4,5,6] Output: 6
 * 
 * Input: root = [] Output: 0
 */

public class CountCompleteTreeNodes {
	
	public static void main(String[] args) {
		
		TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null)), new TreeNode(3, new TreeNode(6, null, null), null));
		
		System.out.println("Numbers of nodes: " + countNodes(treeNode));
	}
	
	
	 public static int countNodes(TreeNode root) {
		 if (root == null) {
		 	return 0;
		 }
		 
		 return 1 + countNodes(root.left) + countNodes(root.right);
		 
	 }
	

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
}
