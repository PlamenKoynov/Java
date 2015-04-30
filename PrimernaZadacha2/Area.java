/*������������ ������� �� �������������� � ���� "size" (� ����� ������� ������),
��� ���������� "type" (����� ���� �� �� ������� "fruits" ��� ��������� 
"vegetables") � ��������� ������� ��������� "amount".
�������� ���� "Area", ����� ������ ������������ �������. �������� ������������ 
get � set ������, ���� �� ��������� �� ����������� �� �������. ����������� 
������� ��������� ������ �� �� ����� ��-������ ��� ����� �� ���� � �� ��-������ 
�� ������ �� ������� ������� �� 100, � ������ ������ �� ������� ������ �� � ����� 
��-������ �� ����. ����� �� ����� �� � ���������, �� �� �� ������ ���������� 
"AreaException" � ��������� ��������� �� ������.
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
