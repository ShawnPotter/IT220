package stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Use /** to start the Javadoc process File: StackQueue.java
 * 
 * @author susan This class has static methods that will transfer the contents
 *         of a queue to a stack and vice versa
 * 
 *         FIFO - a stack is First In First Out which allows adding the "top"
 *         element and removing the "top" element (although java
 *         allows you to treat a stack like an ArrayList where you can remove an 
 *         element in the middle) The toString() for the
 *         stack class prints the bottom of the stack first which can be
 *         consfusing [ 5, 4, 3, 2, 1 ] So stack.pop() would return 1 NOT 5
 * 
 *         LIFO - a queue is Last In First Out which allows adding the "tail"
 *         element and removing the "head" element The toString() for a class
 *         implementing a Queue interface prints the head of the queue first and the tail
 *         last
 * 
 */

public class StackQueue {

	/**
	 * The main method creates a stack and queue of integers and 
	 * calls methods to transfer the contents from the stack to queue 
	 * and vice versa
	 * @param args
	 *            not used in program
	 */
	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();

		// create a stack of integers [5,4,3,2,1]
		for (int i = 5; i > 0; i--) {
			s.push(i);
		}

		System.out.println("Stack is " + s);
		System.out.println("Queue is " + q + "\n");

		stackToQueue(s, q); // you can call a static method without the className in the same class

		System.out.println("After stackToQueue: ");
		System.out.println("Stack is " + s);
		System.out.println("Queue is " + q + "\n");

		StackQueue.queueToStack(q, s); // you can always call a static method with it's class name in front

		System.out.println("After queueToStack: ");
		System.out.println("Stack is " + s);
		System.out.println("Queue is " + q + "\n");

	}

	/**
	 * This static method transfers the contents of a queue to a stack At the end of the
	 * method, the queue will be empty [] (postcondition) and the stack will contain
	 * the queue's elements if the parameters are not null
	 * 
	 * @param q
	 *            - queue of integers (LIFO)
	 * @param s
	 *            - stack of integers (FIFO)
	 */
	public static void queueToStack(Queue<Integer> q, Stack<Integer> s) {
		if (s != null && q != null) {
			while (!q.isEmpty()) {
				int num = q.remove();
				s.push(num);
			}
		}
	}

	/**
	 * This static method transfers the contents of a stack to a queue At the end of the
	 * method, the stack will be empty [] (postcondition) and the queue will contain
	 * the stack's elements if the parameters are not null
	 * 
	 * @param s
	 *            stack of integers (FIFO) -
	 * @param q
	 *            queue of integers (LIFO) -
	 */
	public static void stackToQueue(Stack<Integer> s, Queue<Integer> q) {
		if (s != null && q != null) {
			while (!s.isEmpty()) {
				int num = s.pop();
				q.add(num);
			}
		}
	}
}
