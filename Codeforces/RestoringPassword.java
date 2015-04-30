import java.util.Scanner;

public class RestoringPassword {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] numbers = new String [10];
		String result = "";
		
		String pass = in.nextLine();
		for(int i = 0; i <= 9; i++){
			numbers[i] = in.nextLine();
		}
		
		for(int i = 1; i < 80; i += 10){
			String part = pass.substring(i - 1, i + 9);
			for(int j = 0; j <= 9; j++){
				if(part.equals(numbers[j])){
					result += j;
					break;
				}
			}
		}
		System.out.println(result);
		
	}

}
