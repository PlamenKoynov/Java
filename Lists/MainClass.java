public class MainClass {
	
	public static void main(String args[]){
		MyLinkedList ml = new MyLinkedList();
		MyFasterLinkedList mfl = new MyFasterLinkedList();
		for(int i = 0; i <= 999; i++){
			ml.add(i + 1);
			mfl.add(i);
		}
		
	Thread t1 = new Thread(ml);
	Thread t2 = new Thread(mfl);
	
	t1.start();
	t2.start();
	
	}
}
