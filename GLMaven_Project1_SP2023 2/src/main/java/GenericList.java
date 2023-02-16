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
		
		
	}
	// Abstract methods because implementation depends on the data structure used.
	abstract void add(T data);
	abstract T delete();

	
	// prints the items of the list, one value per line. If the list is empty, print "Empty List"
	void print() {
		
		Node<T>first = head;
		
		while(first != null) {
			System.out.println(first.data);
			first = first.next;
		}
		if(length == 0) {
			System.out.println("Empty List");
		}
		
	}
	
	
	// adds the value to the list. This method is abstract since the implementation depends on what the data structure is
	
	
	// This method will also be abstract since the implementation depends on the type of data structure and how the user want to delete 
	// nodes (from the front, back,... etc.). If the list is empty, it should return null.
	
		
	
	
	// This method stores and returns all values currently in the list into an ArrayList and returns it.
	public ArrayList<T> dumplist() {
		// needs to return something
	}
	
	// return the value at the specified index or null if the index is out of bounds.
	public T get(int index) {
		// needs to return something 
	}
	
	// replace the element at specified position in the list with the specified element and return element previously at the specified position.
	// return null if index is out of bounds.
	public T set(int index, T element) {
		// needs to return something
	}
	
	// these are getters and setters for the program.
					void getLength() {
						return length;
					}
					
					void setLength(int length) {
						this.length = length;
 					}
					
					void getHead() {
						return head;
					}
					
					void setHead(Node<T> head)  {
						this.head = head;
					}
					
	Iterator<T> descendingIterator() {
		//needs to return something
	}
	// one interator is going to be reverse interator that reverses the values from the loop
	// one interator in the hashmap, you will need to use hasNext and next in hashmap iterator.
	
	
}