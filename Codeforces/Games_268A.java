import java.util.Scanner;
public class Games_268A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[][] teams = new int[size][2];
		int counter = 0;
		in.nextLine();
		for(int i = 0; i <= size - 1; i++){
			teams[i][0] = in.nextInt();
			teams[i][1] = in.nextInt();
			in.nextLine();
		}
		
		for(int i = 0; i <= size - 1; i++){
			for(int j = 0; j <= size - 1; j++){
				if(teams[i][0] == teams[j][1]){
					counter += 1;
				}
			}
		}
		
		System.out.println(counter);
		
	}

}
