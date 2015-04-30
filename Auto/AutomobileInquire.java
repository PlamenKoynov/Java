public class AutomobileInquire {
	private String newOwner, oldOwner, registration;
	private int number;
	
	public AutomobileInquire(){
		newOwner = "";
		oldOwner = "";
		registration = "";
		number = 0;
	}
	
	public AutomobileInquire(String oldOwner, String newOwner, String registration) throws Exception{
		if(oldOwner == null || newOwner == null || registration == null){
			throw new Exception("All fields are required!");
		}
		this.oldOwner = oldOwner;
		this.newOwner = newOwner;
		this.registration = registration;
		number = 0;
	}
	
	public void setNumber(int number) throws Exception{
		if(number <= 0){
			throw new Exception("The number must be positive number!");
		}
		this.number = number;
	}

	public String getNewOwner() {
		return newOwner;
	}

	public String getOldOwner() {
		return oldOwner;
	}

	public String getRegistration() {
		return registration;
	}

	public int getNumber() {
		return number;
	}
	
	public String getRegistrationArea(){
		StringBuilder st = new StringBuilder();
		if(getRegistration().charAt(1) >= '0' && getRegistration().charAt(1) <= '9'){
			st.append(getRegistration().charAt(0));
		}
		else{
			st.append(getRegistration().charAt(0));
			st.append(getRegistration().charAt(1));
		}
		return st.toString();
	}
}
