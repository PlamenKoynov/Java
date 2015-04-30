import java.util.Scanner;

public class PasswordCheck_411A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.nextLine().trim();
		if(checkPass(word) == true){
			System.out.println("Correct");
		}
		else{
			System.out.println("Too weak");
		}
	}
	
	private static boolean checkPass(String pass){
		int size = pass.length();
		boolean result = false, flagUp = false, flagLow = false, flagDig = false;
		if(size < 5){
			result = false;
		}
		else{
			for(int i = 0; i <= size - 1; i++){
				char ch = pass.charAt(i);
				if(ch >= 'A' && ch <= 'Z'){
					flagUp = true;
				}
				if(ch >= 'a' && ch <= 'z'){
					flagLow = true;
				}
				if(ch >= '1' && ch <= '9'){
					flagDig = true;
				}
			}
		}
		if(flagDig && flagLow && flagUp){
			result = true;
		}
		return result;
	}

}
