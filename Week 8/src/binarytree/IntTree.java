/*
 * 
 * 5/23/2018
 * IntTree.java
 */

package binarytree;

public class IntTree {
	private IntTreeNode overallRoot;
	
	public IntTree() {
		overallRoot=null; //empty tree
	}
	
	public IntTree(IntTreeNode root) {
		this.overallRoot = root;
	}
	
	public int sum() {
		return sumNodes(overallRoot);
	}
	
	private int sumNodes(IntTreeNode root) {
		if(root != null) {
			return root.data + sumNodes(root.left)+sumNodes(root.right);
		}
		return 0;
	}
	
	public void printSideways() {
		printRecursiveSideways(overallRoot, 0);
	}
	
	//print in-order traversal - go Left, print Data, go Right
	//hint for WordLadder assignment level similar to steps
	private void printRecursiveSideways(IntTreeNode root, int level) {
		if(root != null) {
			printRecursiveSideways(root.right, level+1);
			//print root.data
			for(int i = 0; i < level; i++) {
				System.out.print("    ");
				
			}
			System.out.println(root.data);
			printRecursiveSideways(root.left, level+1);
			
		}
	}
	public void printInOrder() {
		inOrder(overallRoot);
	}
	private void inOrder(IntTreeNode root) {
		if(root != null) {
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	
	public void printPostOrder() {
		postOrder(overallRoot);
	}
	
	private void postOrder(IntTreeNode root) {
		if(root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+ " ");
		}
	}
	
	public void printPreOrder() {
		preOrder(overallRoot);
	}
	
	private void preOrder(IntTreeNode root) {
		if(root != null) {
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	public int getNumLevels() {
		return numLevels(overallRoot, 0);
	}
	private int numLevels(IntTreeNode root, int level){
		if(root != null) {
			return Math.max(numLevels(root.left,level+1), numLevels(root.right, level+1));
		}
		return level;
	}
	public int getNumNodes() {
		return numNodes(overallRoot);
	}
	private int numNodes(IntTreeNode root) {
		if(root != null) {
			
			return 1 + numNodes(root.right) + numNodes(root.left);
		}
		return 0;
	}
	
	
	

}
