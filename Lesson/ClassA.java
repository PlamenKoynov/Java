public class ClassA {
	private String cvyat;
	private int chislo;
	
	public ClassA(){
		cvyat = "";
		chislo = 0;
	}
	
	public ClassA(String cvyat, int chislo) throws Exception{
		if(chislo <= 0){
			throw new Exception("Chisloto ne mozhe da e otricatelno ili 0!");
		}
		this.cvyat = cvyat;
		this.chislo = chislo;
	}
	
	public String getCvyat(){
		return cvyat;
	}
	
	public void setCvyat(String cvyat){
		this.cvyat = cvyat;
	}
	
	public void setChislo(int chislo){
		this.chislo = chislo;
	}
	
	public int getChislo(){
		return chislo;
	}
}
