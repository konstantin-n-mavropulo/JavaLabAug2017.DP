package lesson171129;

import java.util.Iterator;

public class MyList<T> implements Iterable<T> {
	
	private static class Node<T> {
		T data;
		Node<T> next;

		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next; 
		}
	}

	private Node<T> head;
	private Node<T> tail;
	
	public void add(T data) {
		Node<T> node = new Node(data, null);
		if (head == null) {
			head = node;
		} else {
			tail.next = node;
		}
		tail = node;
	}
	
	public void print() {
		Node<T> current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}


	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			
			Node<T> current = head;

			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public T next() {
				T data = current.data;
				current = current.next;
				return data;
			}
		};
	}
	
}
