import java.util.Scanner;
public class PoliceRecruits_427A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int events = in.nextInt();
		int untreated = 0, police = 0;
		in.nextLine();
		for(int i = 0; i <= events - 1; i++){
			int recruit = in.nextInt();
			police += recruit; 
			if(police < 0){
				untreated -= police;
				police = 0;
			}
		}
		
		System.out.println(untreated);
	}
}
