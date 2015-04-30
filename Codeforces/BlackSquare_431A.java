import java.util.Scanner;
public class BlackSquare_431A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] callories = new int[4];
		int size;
		long total = 0L;
		String game;
		for(int i = 0; i <= 3; i++){
			callories[i] = in.nextInt();
		}
		in.nextLine();
		game = in.nextLine();
		size = game.length();
		for(int i = 0; i <= size - 1; i++){
			total += callories[game.charAt(i) - '1'];
		}
		System.out.println(total);
	}

}
