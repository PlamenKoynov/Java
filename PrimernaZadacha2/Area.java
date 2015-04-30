/*Земеделските парцели се характеризират с площ "size" (в мерни единици декари),
тип насаждения "type" (които може да са плодове "fruits" или зеленчуци 
"vegetables") и килограми налична продукция "amount".
Напишете клас "Area", който описва земеделските парцели. Напишете необходимите 
get и set методи, като се погрижите за интегритета на данните. Килограмите 
налична продукция трябва да са число по-голямо или равно на нула и не по-голямо 
от площта на парцела уможена по 100, а самият размер на парцела трябва да е число 
по-голямо от нула. Някое от двете не е изпълнено, то да се хвърля изключение 
"AreaException" с подходящо съобщение за грешка.
*/

public class Area {
	
	private double size, amount; 
	private String type; 
	
	public Area(){
		size = 0;
		type = "none";
		amount = 0;
	}
	
	public Area(double size, String type, double amount) throws AreaException, AreaTypeException{
		if(size < 0){
			throw new AreaException("The area cannot be negative!");
		}
		if(amount <= 0 || amount > size * 100){
			throw new AreaException("The amount is too big!");
		}
		if(!type.equals("fruits") || !type.equals("vegetables")){
			throw new AreaTypeException();
		}
		
		this.size = size;
		this.type = type;
		this.amount = amount;
	}
	
	public void setSize(double size) throws AreaException{
		if(size < 0){
			throw new AreaException("The area cannot be negative!");
		}
		this.size = size;
	}
	
	public double getSize(){
		return size;
	}
	
	public void setType(String type) throws AreaTypeException{
		if(!type.equals("fruits") || !type.equals("vegetables")){
			throw new AreaTypeException();
		}
		this.type = type;
	}
	
	public String getType(){
		return type;
	}
	
	public void setAmount(double amount) throws AreaException{
		if(amount <= 0 || amount > size * 100){
			throw new AreaException("The amount is too big!");
		}
		this.amount = amount;
	}
	
	public double getAmount(){
		return amount;
	}

}
