public class FocusedWorker extends Worker{
	
	String specialisation;
	
	public FocusedWorker(){
		super();
		specialisation = "none";
	}
	public FocusedWorker(String name, int id, double fruitsPower, 
			double vegetablesPower, String specialisation) 
					throws AreaTypeException {
		super(name, id, fruitsPower, vegetablesPower);
		if(!specialisation.equals("fruits") || !specialisation.equals("vegetables")){
			throw new AreaTypeException("The worker shoud be focused on fruits or vegetables!");
		}
		this.specialisation = specialisation;
	}
	
	public void doWork(Area area) throws AreaException{
		double fruits = super.fruitsPower;
		double vegetables = super.vegetablesPower;
		
		if(specialisation.equals("fruits")){
			fruits += fruits * 0.2;
			vegetables -= vegetables * 0.15;
		}
		else{
			vegetables += vegetables * 0.2;
			fruits -= fruits * 0.15;
		}
		
		if(area.getType().equals("fruits")){
			if(area.getAmount() >= fruits){
				area.setAmount(0);
			}
			else{
				area.setAmount(area.getAmount() - fruits);
			}
		}
		else{
			if(area.getAmount() >= vegetables){
				area.setAmount(0);
			}
			else{
				area.setAmount(area.getAmount() - vegetables);
			}
		}
	}
	
	public void doWork(Area area, boolean stickWithNet) throws AreaException{
		if(stickWithNet == true){
			super.fruitsPower += super.fruitsPower * 0.9;
		}
		
		if(area.getType().equals("fruits")){
			if(super.fruitsPower >= area.getAmount()){
				area.setAmount(0);
			}
			else{
				area.setAmount(area.getAmount() - super.fruitsPower);
			}
		}
		else{
			if(super.vegetablesPower >= area.getAmount()){
				area.setAmount(0);
			}
			else{
				area.setAmount(area.getAmount() - super.vegetablesPower);
			}
		}
	}
	

}
