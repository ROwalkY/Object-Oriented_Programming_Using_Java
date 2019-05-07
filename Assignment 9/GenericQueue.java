import java.util.ArrayList;

public class GenericQueue<T>{

	ArrayList<T> myQueue = new ArrayList<T>();
	
	public boolean isEmpty() {
		
		if(myQueue.isEmpty()) {			
			return true;			
		}else {			
			return false;			
		}		
	}
	
	public void enqueue(T object) {		
		myQueue.add(object);		
	}
	
	public T dequeue() {
		
		if(!myQueue.isEmpty()) {
			
			return myQueue.remove(0);
			
		}else {
			
			return null;
			
		}
		
	}
	
	public String toString() {
		
		String result = "***************************************************\n";
		
		result += "The queue has " + myQueue.size() + " elements: ";
		
		for(T n: myQueue) {
			
			result += n.toString();
			
		}
		
		result += "\n***************************************************";
		
		return result;
	}
}
