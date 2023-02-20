import java.util.Iterator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class GQTest {
	static GenericQueue<Integer> queue;
	
	@BeforeAll
	public static void setup() {
		queue = new GenericQueue<Integer>(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
	}
	@Test
	public void constructorTest() {
		assertEquals(10,queue.getHead().data);
		assertEquals(1, queue.getLength());
		
	}
	@Test
	public void enqueueTest() {
		queue.enqueue(10);
		assertEquals(10,queue.getHead().data);
		assertEquals(1, queue.getLength());
	}
	@Test 
	public void dequeueTest() {
		queue.dequeue();
		assertEquals(10, queue.tail.data);
	
	}
}
