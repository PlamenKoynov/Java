public class ClassB extends ClassA{
	private boolean b;
	
	public ClassB(){
		super();
		b = false;
	}
	
	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public ClassB(String cvyat, int chislo, boolean b) throws Exception{
		super(cvyat, chislo);
		this.b = b;
	}
	
	
}
