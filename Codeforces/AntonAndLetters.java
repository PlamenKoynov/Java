import java.util.Scanner;
public class AntonAndLetters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String letters = in.nextLine();
		int [] passed = new int [26];
		int pos = 0, counter = 0;
		char letter;
		while((letter = letters.charAt(pos)) != '}'){
			if(letter >= 'a' && letter <= 'z'){
				if(passed[letter - 'a'] == 0){
					passed[letter - 'a'] = 1;
					counter++;
				}
			}
			pos++;
		}
		System.out.println(counter);
	}

}
