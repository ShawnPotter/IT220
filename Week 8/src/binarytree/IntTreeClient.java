package binarytree;

public class IntTreeClient {

	public static void main(String[] args) {
		IntTreeNode root = new IntTreeNode(50);
		root.left = new IntTreeNode(80);
		root.right = new IntTreeNode(55);
		root.left.left = new IntTreeNode(60);
		root.left.right = new IntTreeNode(75);
		
		
		IntTree tree = new IntTree(root);
		
		tree.printSideways();
		System.out.println("\n"+tree.sum());
		System.out.println("\n\n\n");
		
		IntTreeNode root2 = new IntTreeNode(90);
		root2.left = new IntTreeNode(80);
		root2.right = new IntTreeNode(100);
		root2.left.left = new IntTreeNode(70);
		root2.left.right = new IntTreeNode(85);
		root2.right.left = new IntTreeNode(98);
		root2.right.right = new IntTreeNode(120);
		
		IntTree tree2 = new IntTree(root2);
		
		tree2.printSideways();
		System.out.println("\n\nIN ORDER:");
		tree2.printInOrder();
		System.out.println("\nPRE ORDER:");
		tree2.printPreOrder();
		System.out.println("\nPOST ORDER:");
		tree2.printPostOrder();
		System.out.println("\n\nnumLevels= "+tree2.getNumLevels());
		System.out.println("numNodes= "+tree2.getNumNodes());
		
	}
}
