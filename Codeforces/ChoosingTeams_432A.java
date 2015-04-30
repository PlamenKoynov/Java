import java.util.Scanner;

public class ChoosingTeams_432A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] years = new int[6];
		int size, max, counter = 0;
		size = in.nextInt();
		max = in.nextInt();
		in.nextLine();
		for(int i = 0; i <= size - 1; i++){
			int num = in.nextInt();
			years[num] += 1;
		}
		for(int i = 0; i <= 5 - max; i++){
			counter += years[i];
		}
		System.out.println(counter / 3);
	}

}
