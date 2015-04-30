import java.util.ArrayList;
public class MVRCS {
	private ArrayList<AutomobileInquire> list = new ArrayList<AutomobileInquire>();
	private int inputNumber = 1;
	private int gateNumber;
	
	public MVRCS() throws java.util.InputMismatchException, Exception{
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print("Gate number: ");
		int gate = in.nextInt();
		if(gate <= 0){
			throw new Exception("The gate should be positive number!");
		}
		this.gateNumber = gate;
	}
	
	public int addInquire(AutomobileInquire auto) throws Exception{
		auto.setNumber(inputNumber);
		inputNumber += 1;
		list.add(auto);
		return (inputNumber - 1);
	}
	
	public boolean removeInquire(int inNumber){
		for(AutomobileInquire auto : list){
			if(auto.getNumber() == inNumber){
				list.remove(auto);
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<AutomobileInquire> getList(){
		return list;
	}
	
	public void changeRegistration(){
		int minReg = Integer.MAX_VALUE;
		while(!list.isEmpty()){
			for(int i = 0; i <= list.size() - 1; i++){
				if(list.get(i).getNumber() < minReg){
					minReg = list.get(i).getNumber();
				}
			}
			this.removeInquire(minReg);
			minReg = Integer.MAX_VALUE;
		}
		System.out.println("Ready!");
	}
}
