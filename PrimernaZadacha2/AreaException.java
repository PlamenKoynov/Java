public class AreaException extends Exception{
	
	public AreaException(){
		super("There is a problem with the size of the area or the amount!");
	}
	
	public AreaException(String msg){
		super(msg);
	}
	
	public String toString(){
		return "There is a problem with the size of the area or the amount!";
	}

}
