import java.util.Scanner;

public class Reversal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine().trim();
		line = stringReverse(line);
		System.out.println(line);
	}
	
	private static String stringReverse(String line){
		StringBuilder sb = new StringBuilder();
		for(int i = line.length() - 1; i >= 0; i--){
			sb.append(line.charAt(i));
		}
		return sb.toString();
	}

}
