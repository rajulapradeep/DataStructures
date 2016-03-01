package stack;

/**
 * @author Pradeep Rajula
 * dynArrayStack dynamically creates a new array double the size of previous array and copies the elements
 * Space complexity is O(n) for n push operations
 * Time complexity of push/pop/isEmpty/isFullStack/deleteStack is O(1)
 */
public class DynArrayStack {

	public static void main(String[] args){
		DynArrayStack dynArrayStack = new DynArrayStack();
		dynArrayStack .push(1);
		dynArrayStack .push(2);
		dynArrayStack .push(3);
		dynArrayStack .push(4);
		dynArrayStack .push(5);
		dynArrayStack .push(6);
		dynArrayStack .push(7);
		System.out.println("Pop element is "+dynArrayStack.pop());
		System.out.println("Pop element is "+dynArrayStack.pop());
		System.out.println("Pop element is "+dynArrayStack.pop());
		System.out.println("Pop element is "+dynArrayStack.pop());
		
	}
	private static int top;
	private static int capacity;
	private static int[] array;

	public DynArrayStack() {
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
		{
			doubleStack();
			push(data);
		}	
		
		else
			array[++top] = data;
	}
	// double stack creates a new array of double the size and copies the earlier array into new array
	private void doubleStack(){
		int newArray[] = new int[capacity * 2];
		System.arraycopy(array, 0, newArray, 0, capacity);
		capacity = capacity * 2;
		array = newArray;
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
