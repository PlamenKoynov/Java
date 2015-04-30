import java.util.Random;

public class MyLinkedList implements Runnable{
  
	private Node head;
    private int counter;
 
    
    public MyLinkedList() {
        head = new Node(null);
        counter = 0;
    }
 
    public void add(Object data){
    	
        Node temp = new Node(data);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        counter++;
    }
 
    public Object get(int index){
        if (index <= 0)
            return null;
 
        Node current = head.getNext();
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null)
                return null;
            current = current.getNext();
        }
        return current.getData();
    }
 
    public boolean remove(int index){
        
    	if (index < 1 || index > size())
            return false;
 
        Node current = head;
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null)
                return false;
 
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        counter--;
        return true;
    }
 
    public int size(){
        return counter;
    }
 
    public String toString() {
        Node current = head.getNext();
        String output = "";
        while (current != null) {
            output += "[" + current.getData().toString() + "]";
            current = current.getNext();
        }
        return output;
    }
    
    public void run(){
    	Random rand = new Random();
    	for(int i = 0; i <= 999; i++){
    		add(i);
    	}
    	for(int i = 0; i <= 1000000; i++){
    		get(rand.nextInt(1000) + 1);
    	}
    	
    	System.out.println("MyLinkedList finished!");
    }
}