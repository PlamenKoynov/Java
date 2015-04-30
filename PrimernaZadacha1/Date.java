//1. Дефинирайте клас, описващ дати от календара.
//а) Дефинирайте конструктор по подразбиране и такъв с параметри за задаване на дата.
//б) Дефинирайте за него подходящите get и set методи.
//в) Направете необходимите проверки за валидност на данните (ако не са валидни да се генерира изключение)

public class Date {
	private int day, month, year; 
	
	public Date(){
		day = 1; 
		month = 1; 
		year = 1900; 
	}
	
	public Date(int day, int month, int year) throws DateException{
		if(this.validate(day, month, year)){
			this.day = day;
			this.month = month;
			this.year = year;
		}
		else{
			throw new DateException();
		}
	}
	
	public void setDay(int day) throws DateException{
		if(day < 1 || day > 31){
			throw new DateException();
		}
		else{
			this.day = day;
		}
	}
	
	public int getDay(){
		return day;
	}
	
	public void setMonth(int month) throws DateException{
		if(month < 1 || month > 12){
			throw new DateException();
		}
		else{
			this.month = month;
		}
	}
	
	public int getMonth(){
		return month;
	}
	
	public void setYear(int year) throws DateException{
		if(year < 1900 || year > 2014){
			throw new DateException();
		}
		else{
			this.year = year;
		}
	}
	
	public int getYear(){
		return year;
	}
	
	public boolean validate(int day, int month, int year){
		if(day < 1 || day > 31){
			return false;
		}
		if(month > 12 || month < 1){
			return false;
		}
		if(year < 1900 || year > 2014){
			return false;
		}
		return true;
	}
	
	public String toString(){
		String line = "Date: " + getDay() + "/ " + getMonth() + "/ " + getYear() + "\n";
		return line;
	}
	
}
