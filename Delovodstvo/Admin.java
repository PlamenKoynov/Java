public class Admin extends Person{
	
	private String position;
	
	public Admin(){
		super();
		position = "";
	}
	
	public Admin(String name, String egn, String position) throws Exception{
		super(name, egn);
		if(position == null){
			throw new Exception("Admin must have position!");
		}
		this.position = position;
	}

}
