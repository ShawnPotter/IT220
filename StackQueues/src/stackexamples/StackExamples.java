package stackexamples;

import java.util.Stack;

public class StackExamples {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("apple");
		stack.push("banana");
		/*stack.push("oranges");
		stack.push("grapes");
		stack.push("lemons");*/
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		if(!stack.isEmpty())
		{
			System.out.println(stack.pop());	
		}
	}
}
