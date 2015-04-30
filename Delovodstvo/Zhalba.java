public class Zhalba extends Zaqvlenie{
	
	private Admin soonUnemployed;
	
	public Zhalba(){
		super();
		soonUnemployed = null;
	}
	
	public Zhalba(Client sender, int inNumber, String text, boolean status, Admin reciever)
		throws Exception{
		super(sender, inNumber, text, status, reciever);
		soonUnemployed = null;
	}
	
	public Zhalba(Client sender, int inNumber, String text, boolean status, Admin reciever,
			Admin soonUnemployed)
			throws Exception{
			super(sender, inNumber, text, status, reciever);
			this.soonUnemployed = soonUnemployed;
		}
}
