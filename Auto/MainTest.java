import java.util.ArrayList;

public class MainTest {
	public static void main(String args[]){
		try{
			AutomobileInquire auto1 = new AutomobileInquire("Ivan", "Dragan", "CA1994BA");
			AutomobileInquire auto2 = new AutomobileInquire("Ceco", "Stoimen", "A1001KK");
			AutomobileInquire auto3 = new AutomobileInquire("Krasio", "Petraki", "CT8933BB");
			
			MVRCS mvr = new MVRCS();
			mvr.addInquire(auto1);
			mvr.addInquire(auto2);
			mvr.addInquire(auto3);
			
			//mvr.changeRegistration();
			
			ArrayList<AutomobileInquire> list1 = mvr.getList();
			list1.add(auto1);
			
			System.out.println(auto2.getRegistrationArea());
			
			if(mvr.removeInquire(4)){
				System.out.println("Ready!");
			}
			else{
				System.out.println("There is no such car!");
			}
		}
		catch(Exception e){
			System.err.println(e.getMessage());
		}
	}
}
