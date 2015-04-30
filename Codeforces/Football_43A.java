import java.util.Scanner;

public class Football_43A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] teams = new String[100];
		int[] goals = new int[100];
		int size = in.nextInt(), lastIndex = 0, maxGoals = Integer.MIN_VALUE, index = 0;
		
		in.nextLine();
		
		for(int i = 0; i <= size - 1; i++){
			String line = in.nextLine().trim();
			boolean exists = false;
			for(int j = 0; j <= lastIndex - 1; j++){
				if(line.equals(teams[j])){
					goals[j]++;
					exists = true;
				}
			}
			if(exists == false){
				teams[lastIndex] = line;
				lastIndex++;
			}
		}
		
		for(int i = 0; i <= lastIndex - 1; i++){
			if(goals[i] > maxGoals){
				maxGoals = goals[i];
				index = i;
			}
		}
		
		System.out.println(teams[index]);
	}

}
