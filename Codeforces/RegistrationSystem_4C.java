import java.util.Scanner;
import java.util.ArrayList;

public class RegistrationSystem_4C {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] index = new int[size];
		ArrayList<String> list = new ArrayList<String>(size);
		ArrayList<String> status = new ArrayList<String>(size);
		in.nextLine();
		
		for(int i = 0; i <= size - 1; i++){
			String line = in.nextLine().trim();
			int include = 0;
			if((include = list.indexOf(line)) != -1){
				index[include] += 1;
				status.add(line + index[include]);
			}
			else{
				list.add(line);
				status.add("OK");
			}
		}
		
		for(String stat : status){
			System.out.println(stat);
		}
	}
}
