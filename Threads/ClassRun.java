import java.util.Random;

public class ClassRun implements Runnable{
	
	String nameOfClass;
	int state = 0;
	int counter = 0;
	
	public ClassRun(String nameOfClass){
		this.nameOfClass = nameOfClass;
	}
	
	public void run(){
		System.out.println(nameOfClass + " is going to wait...");
		while(true){
			putSomething();
		}
	}
	
	public synchronized void putSomething(){
		if(state == 1){
			try {
				System.out.println("I'm going to wait...");
				wait();
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}
		System.out.println("I'm going to increment!");
		counter += 1;
		System.out.println("Ready!");
		notify();
	}
	
	public synchronized void getSomething(){
		if(state == 1){
			try {
				System.out.println("I'm going to wait...");
				wait();
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}
		System.out.println("I have: " + counter);
		Random rand = new Random();
		state = rand.nextInt(2);
		notify();
	}
}
