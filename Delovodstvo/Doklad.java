public class Doklad extends Letters{
	
	public Doklad(){
		super();
	}
	
	public Doklad(Admin sender, int inNumber, String text) throws Exception{
		super(sender, inNumber, text);
	}
}
