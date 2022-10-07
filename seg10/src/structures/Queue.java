package structures;

import exception.isEmptyException;
import exception.isFullException;
import interfacee.IQueue;

public class Queue<T> implements IQueue<T> {

	private int last;
	private int size;
	private T queue[];
	
	public Queue(int size) {
		this.size=size;
		last=0;
		queue = (T[]) new Object[size];
	}
	
	@Override
	public boolean add(T element) {
		// TODO Auto-generated method stub
		if(last== size+1) {
			throw new isFullException();
			
		}else {
				queue[last]= element;
				last++;
				
				return true;
		}
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if(last ==0) {
			throw new isEmptyException();
		}else {
			return queue[0];
		}
	}

	@Override
	public T pool() {
		// TODO Auto-generated method stub
		if(last==0) {
			throw new isEmptyException();
		}else {
			T aux= queue[0];
			for(int i=0; i<size-1; i++) {
				queue[i]= queue[i+1];
			}
			last--;
			queue[last]= null;
			return aux;
		}
	}
	
	public int size() {
		return last;
	}

	
}
