import java.util.Iterator;

public class ReverseGLLIterator<E> implements Iterator<E> {

	GenericList<E>.Node<E> temp;
	ReverseGLLIterator(GenericList<E>.Node<E> head) {
		temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
	}
	@Override
	public boolean hasNext() {
		return temp != null;
		
	}
	@Override
	public E next() {
		E val = null;
		val = temp.data;
		temp = temp.prev;
		return val;
	}
	
}
