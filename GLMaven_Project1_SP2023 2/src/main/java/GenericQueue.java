import java.util.Iterator;


public class GenericQueue<T> extends GenericList<T> {
	Node<T> tail;
	
	public void add(T data) {
		Node<T> tempNode = new Node(data);
		
		if(getHead() == null) {
			setHead(tempNode);
			setLength(getLength() +1);
			tail = tempNode;
			
			
		}
		
		
	}
	public GenericQueue(T val) {
		super(val);
		Node<T> newNode = new Node<T>(val);
		setHead(newNode);
		tail = newNode;
		setLength(1);
	}
//	public delete() {
//		return null;
//	}
	 void enqueue(T data) {
		add(data);
	}
	public T dequeue() {
		return delete();
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	T delete() {
		// TODO Auto-generated method stub
		return null;
	}
}
	
	
	  
