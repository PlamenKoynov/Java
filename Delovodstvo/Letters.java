public abstract class Letters {
	Person sender;
	private int inNumber;
	private String text; 
	
	public Letters(){
		sender = new Person();
		inNumber = 0;
		text = "";
	}
	
	public Letters(Person sender, int inNumber, String text) throws Exception{
		if(sender == null || text == null){
			throw new Exception("Must have sender and text!");
		}
		if(text.length() < 100){
			throw new Exception("The text must be at least 100 symbols!");
		}
		this.sender = sender;
		this.inNumber = inNumber;
		this.text = text;
	}
	
}
