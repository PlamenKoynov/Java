public class Client extends Person{
	
	private int number;
	
	public Client(){
		super();
		number = 0;
	}
	
	public Client(String name, String egn, int number) throws Exception{
		super(name, egn);
		if(number <= 0){
			throw new Exception("Number cannot be negative or zero!");
		}
		this.number = number;
	}

}
