public class Node {
	
	private Node next;
	private Node afterK;
	private Object data;
	
	public Node(Object data) {
		next = null;
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public void setNextK(Node afterK){
		this.afterK = afterK;
	}
	
	public Node getNextK(){
		return afterK;
	}
}
