import java.util.HashSet;

public class MyHashSet {
    private HashSet<Integer> set = new HashSet<>();
    public MyHashSet() {
    }
    
    public void add(int key) {
        if (!contains(key))set.add(key);
    }
    
    public void remove(int key) {
    	if (contains(key))
    		set.remove(key);
    }
    
    public boolean contains(int key) {
    		return set.contains(key);
    }
}
