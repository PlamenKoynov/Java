public class Worker {
	
	String name;
	int id; 
	double fruitsPower, vegetablesPower;
	
	public Worker(){
		name = "";
		id = 0;
		fruitsPower = 0;
		vegetablesPower = 0;
	}
	
	public Worker(String name, int id, double fruitsPower, double vegetablesPower){
		this.name = name;
		this.id = id;
		this.fruitsPower = fruitsPower;
		this.vegetablesPower = vegetablesPower;
	}
	
	public void doWork(Area area) throws AreaException{
		if(area.getType().equals("fruits")){
			if(this.fruitsPower >= area.getAmount()){
				area.setAmount(0);
			}
			else{
				area.setAmount(area.getAmount() - this.fruitsPower);
			}
		}
		else{
			if(this.vegetablesPower >= area.getAmount()){
				area.setAmount(0);
			}
			else{
				area.setAmount(area.getAmount() - this.vegetablesPower);
			}
		}
	}
	
	public void doWork(Area area, boolean stickWithNet) throws AreaException{
		if(stickWithNet == true){
			this.fruitsPower += this.fruitsPower * 0.6;
		}
		
		if(area.getType().equals("fruits")){
			if(this.fruitsPower >= area.getAmount()){
				area.setAmount(0);
			}
			else{
				area.setAmount(area.getAmount() - this.fruitsPower);
			}
		}
		else{
			if(this.vegetablesPower >= area.getAmount()){
				area.setAmount(0);
			}
			else{
				area.setAmount(area.getAmount() - this.vegetablesPower);
			}
		}
	}
}
