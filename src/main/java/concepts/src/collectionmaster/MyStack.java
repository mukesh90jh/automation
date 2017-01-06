/**
 * 
 */
package  concepts.src.collectionmaster;

/**
 * @author mukesh
 *
 */
public class MyStack {
	private static final int maxSize = 4;
	private static int[] stackArray;
	private static int top;
	public MyStack() {
		stackArray = new int[maxSize];
		top = -1;
	}
	public void push(int j) {
		if(top<maxSize-1)
			stackArray[++top] = j;
		else
			System.out.println("Stack Overflow !");
	}
	public void pop() {
		if (top >= 0) {
			top--;
		} else {
			System.out.println("Stack Underflow !");
		}
	}
	public int peek() {
		return stackArray[top];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull() {
		return (top == maxSize - 1);
	}

	public static void printElements() {
		if (top >= 0) {
			System.out.println("Elements in stack :");
			for (int i = 0; i <= top; i++) {
				System.out.println(stackArray[i]);
			}
		}
	}
	public static void main(String[] args) {
		MyStack theStack = new MyStack(); 
		theStack.push(10);
		theStack.push(30);
		theStack.push(40);
		theStack.push(50);
		printElements();


	}
}


