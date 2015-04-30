import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word;
		StringBuilder reversed = new StringBuilder();
		
		System.out.print("Enter the word you want to reverse: ");
		word = in.next("\\w+");
		
		System.out.printf("Reversed %s is %s!\n", word, getReverse(word));
	}
	
	public static String getReverse(String original){
		StringBuilder reverse = new StringBuilder();
		for(int i = original.length() - 1; i >= 0; i--){
			reverse.append(original.charAt(i));
		}
		return reverse.toString();
	}
}
