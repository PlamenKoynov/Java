import java.util.Scanner;

public class Word_59A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word; 
		word = in.next("\\w+");
		if(getUpper(word) == true){
			System.out.println(word.toUpperCase());
		}
		else{
			System.out.println(word.toLowerCase());
		}
	}
	
	private static boolean getUpper(String check){
		int size = check.length();
		char ch; 
		int upper = 0, lower = 0;
		for(int i = 0; i <= size - 1; i++){
			ch = check.charAt(i);
			if(ch >= 'A' && ch <= 'Z'){
				upper++;
			}
			else if(ch >= 'a' && ch <= 'z'){
				lower++;
			}
		}
		return (upper > lower);
	}

}
