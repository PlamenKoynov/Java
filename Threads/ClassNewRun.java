public class ClassNewRun implements Runnable{
	
	ClassRun cr;
	boolean state = false;
	
	public ClassNewRun(ClassRun cr){
		this.cr = cr;
	}
	
	public void run(){
		while(true){
			cr.getSomething();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}
	}
}
