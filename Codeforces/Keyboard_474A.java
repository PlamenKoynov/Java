import java.util.Scanner; 

public class Keyboard_474A {

	static String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./"; 
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String dir = in.nextLine();
		String key = in.nextLine();
		
		int plus = -1; 
		if(dir.equals("L")){
			plus = 1;
		}
				
		System.out.println(findReal(key, plus));
	}
	
	static String findReal(String key, int plus){
		StringBuilder sb = new StringBuilder();
		int size = key.length() - 1;
		for(int i = 0; i <= size; i++){
			int index = keyboard.indexOf(key.charAt(i));
			sb.append(keyboard.charAt(index + plus));
		}
		
		return sb.toString();
	}

}
