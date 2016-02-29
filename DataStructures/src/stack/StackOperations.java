package stack;

/**
 * @author Pradeep Rajula Stack operations push, pop, delete using arrays
 */

public class StackOperations {

	public static void main(String[] args) {

		StackOperations stackOperations = new StackOperations();
		stackOperations.push(3);
		System.out.println("Pop element is " + stackOperations.pop());

		stackOperations.deleteStack();
		
	}

	private static int top;
	private static int capacity;
	private static int[] array;

	public StackOperations() {
		capacity = 1;
		array = new int[capacity];
		top = -1;
	}

	public static boolean isEmpty() {
		return (top == -1);
	}

	public static boolean isStackFull() {
		return (top == capacity - 1);
	}
	// push operation checks to see if the stack is full by checking the position of top 
	// if top is positive appends an element else returns stack is full
	public void push(int data) {
		if (isStackFull())
			System.out.println("stack overflow");
		else
			array[++top] = data;
	}
	// pop operation checks to see if the stack is empty by check if top is equal to -1
	// if true returns empty else returns the element
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return 0;

		} else
			return (array[top--]);
	}
	// delete operation assigns top as -1
	public void deleteStack() {
		top = -1;
	}

}
