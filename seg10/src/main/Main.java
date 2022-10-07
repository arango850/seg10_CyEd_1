package main;

import structures.Queue;
import structures.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue(1);
		int a = 10;
		queue.add(a);
		System.out.println(queue.peek());
		Stack stack = new Stack(10);
		int a1 = 1;
		int b = 2;
		
		stack.push(a1);
		stack.push(b);
		
		System.out.println(stack.size());
		
		
	}

}
