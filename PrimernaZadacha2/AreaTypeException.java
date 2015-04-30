public class AreaTypeException extends Exception{
	
	public AreaTypeException(){
		super("The area type is wrong!");
	}
	
	public AreaTypeException(String msg){
		super(msg);
	}
	
	public String toString(){
		return "The area type is wrong!";
	}

}
