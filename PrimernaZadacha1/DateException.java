public class DateException extends Exception{
	
	public DateException(){
		super("Wrong date format!");
	}
	
	public DateException(String msg){
		super(msg);
	}
	
	public String toString(){
		return "Inavalid date format!";
	}
}
