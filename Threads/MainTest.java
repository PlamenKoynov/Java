import java.util.Random;
import java.util.concurrent.Semaphore;

public class MainTest {
	
	public static void main(String args[]){
		/*Random rand = new Random();
		int numberOfThreads = rand.nextInt(10) + 1;
		System.out.println("Number of threads: " + numberOfThreads);
		Thread [] threads = new Thread [numberOfThreads];
		for(int i = 0; i <= numberOfThreads - 1; i++){
			ClassRun r = new ClassRun("Thread " + (i + 1));
			threads[i] = new Thread(r);
		}
		
		for(int i = 0; i <= numberOfThreads - 1; i++){
			threads[i].start();
		}
		*/
		
		ClassRun r = new ClassRun("Ivan");
		ClassNewRun nr = new ClassNewRun(r);
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(nr);
		t1.start();
		t2.start();
	}
}
