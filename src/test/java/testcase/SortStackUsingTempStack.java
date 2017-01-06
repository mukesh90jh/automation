package testcase;

import java.util.Stack;

public class SortStackUsingTempStack {
	public static void main(String []args){
		
	}


	public static Stack<Integer> sortStack(Stack<Integer> inputStack){
		Stack<Integer> tempStack = new Stack<Integer>();
		while(!inputStack.isEmpty()) {
			int temp = inputStack.pop();
			while(!tempStack.isEmpty() && tempStack.peek() > temp) {
				inputStack.push(tempStack.pop());
			}
			tempStack.push(temp);
		}
		return tempStack;
	}

}