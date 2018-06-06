package trees;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TreeTester {

	public static void main(String[] args) {
	
	    testWriteTree();
		testReadTree();
	   

	}
	
	
	
	
	public static void testReadTree() {
		System.out.println("\n Read Tree");
		IntTree treeRead = new IntTree();
		try (Scanner fileIn = new Scanner(new File("files/tree1.txt"))) {
			treeRead.readTree(fileIn);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		treeRead.printSideways();
		
		treeRead.printSideways();
		treeRead.printPreorder();
	}
	//     8
	//    /  \
	//   6   10
	//  /    / \
	// 5     9  11
	//        \
	//         7
	public static void testWriteTree() {
		IntTreeNode root = new IntTreeNode(8);
		root.left = new IntTreeNode(6);
		root.right = new IntTreeNode(10);

		root.left.left = new IntTreeNode(5);
		root.right.left = new IntTreeNode(9);
		root.right.right = new IntTreeNode(11);

		root.right.left.right = new IntTreeNode(7);
		IntTree t = new IntTree(root);

		t.printSideways();

		try (PrintWriter fileOut = new PrintWriter(new File("files/tree1.txt"))) {
			t.writeTree(fileOut);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
 

}
