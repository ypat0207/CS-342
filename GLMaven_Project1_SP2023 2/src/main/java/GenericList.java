import java.util.ArrayList;

import java.util.Iterator;
import java.util.LinkedList;
public abstract class GenericList<T> implements Iterable<T>  {
	private Node<T> head;
	private int length;
	
	
	GenericList() {
		this.head = null;
		this.length = 0;
		
	}
	GenericList(T value) {
		this.head = new Node<T>(value);
		this.length = 1;
		
	}
	public class Node<T> {
		T data;
		int code;
		Node<T>next;
		Node<T>prev;
		public Node(T val) {
			this.data = val;
			this.next = null;
			this.prev = null;
		}
		
		
	}
	// Abstract methods because implementation depends on the data structure used.
	abstract void add(T data);
	abstract T delete();

	
	// prints the items of the list, one value per line. If the list is empty, print "Empty List"
	void print() {
		
		Node<T>first = head;
		
		if(first == null) {
			System.out.print("Empty list!!");
		}
		while(first != null) {
			System.out.println(first.data);
			first = first.next;
			
		}
	}
	
	
	// adds the value to the list. This method is abstract since the implementation depends on what the data structure is
	
	
	// This method will also be abstract since the implementation depends on the type of data structure and how the user want to delete 
	// nodes (from the front, back,... etc.). If the list is empty, it should return null.

	// This method stores and returns all values currently in the list into an ArrayList and returns it.
	public ArrayList<T> dumplist() {
		ArrayList <T> dumpArray = new ArrayList<T>();
		 Node <T> first = head;
	       for(int i = 0; i < length; i++) {
	    	   dumpArray.add(first.data);
	    	   first = first.next;
	    	}
	        return dumpArray;
	}
	
	// return the value at the specified index or null if the index is out of bounds.
	public T get(int index) {
		// needs to return something 
		if (index < 0 || index > length - 1) {
            return null;
        }

        Node <T> first = head;
        for(int i = 0; i < index-1; i++) {
        	first = first.next;
        }
        T val = first.data;
        return val;
	}
	
	// replace the element at specified position in the list with the specified element and return element previously at the specified position.
	// return null if index is out of bounds.
	public T set(int index, T element) {
		// needs to return something
		if (index < 0 || index > length - 1) {
            return null;
        }
  
        Node <T> first = head;
        for(int i = 0; i < index-1; i++) {
        	first = first.next;
        }
        T val = first.data;
        first.data = element;
        return val;
	}
	
	// these are getters and setters for the program.
					int getLength() {
						return length;
					}
					
					void setLength(int length) {
						this.length = length;
 					}
					
					Node<T> getHead() {
						return head;
					}
					
					void setHead(Node<T> head)  {
						this.head = head;
					}
					
	Iterator<T> descendingIterator() {
		return new ReverseGLLIterator(head);
	
	}
	
	
	
	
}