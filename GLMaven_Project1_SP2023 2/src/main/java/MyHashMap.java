import java.util.ArrayList;

public abstract class MyHashMap<T> implements Iterable<T> {
	
	private ArrayList<GenericQueue<T>> map;
	
	MyHashMap(String key, T value) {
		map = new ArrayList<GenericQueue<T>>(10);
		
		for(int i = 0; i < map.size(); i++) {
			map.add(new GenericQueue<T>());
			}
			put(key,value);
		}
	
	
	public void put(String key, T value) {
		int hashCode = key.hashCode();
		
		
	}
	public boolean contains(String key) {
		
	}
	public T get(String key) {
		
	}
	public int size() {
		
	}
	public boolean isEmpty() {
		
	}
	public T replace(String key, T value) {
		
	}
}
