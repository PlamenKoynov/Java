public class Person {
	
	String name, egn;
	
	public Person(){
		name = "";
		egn = "";
	}
	
	public Person(String name, String egn) throws Exception{
		if(name == null || egn == null){
			throw new Exception("Wrong data! Cannot be null!");
		}
		this.name = name;
		this.egn = egn;
	}

}
