package structures;

import exception.IsFullExceptionStack;
import exception.isEmptyException;
import exception.isEmptyExceptionStack;
import interfacee.IStack;

public class Stack<T> implements IStack<T> {

	private int size;
	private int current;
	private T stack[];
	
	public Stack( int size) {
		this.size = size;
		current =0;
		stack= (T[]) new Object[this.size];
	}
	
	public void push(T obj) {
		if(current>size) {
			throw new IsFullExceptionStack();
		}else {
			stack[current++]= obj;
		}
	}
	
	public T pop() {
		if(current ==0) {
			throw new isEmptyExceptionStack();
			
		}else {
			return stack[-- current];
		}
	}
	
	public T peek() {
		if(current==0) {
			throw new isEmptyExceptionStack();
			
		}else {
			int aux = current;
			return stack[--aux];
		}
	}
	public int size() {
		return size;
	}
}
