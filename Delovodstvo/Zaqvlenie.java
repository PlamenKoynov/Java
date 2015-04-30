public class Zaqvlenie extends Letters{
	
	private boolean status;
	private Admin reciever;
	
	public Zaqvlenie(){
		super();
		status = false;
		reciever = new Admin();
	}
	
	public Zaqvlenie(Client sender, int inNumber, String text, boolean status, Admin reciever) throws Exception{
		super(sender, inNumber, text);
		if(reciever == null){
			throw new Exception("The reciever must exist!");
		}
		this.status = status;
		this.reciever = reciever;
	}	

}

