import java.util.Scanner; 
import java.util.InputMismatchException;; 

public class Task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		System.out.print("Enter the number: ");
		try{
			num = in.nextInt();
			System.out.println("The last digit of " + num + " is " + sayLastDigit(num) + "!");
		}
		catch(InputMismatchException e){
			System.err.println("The number is too big!" + e.getMessage());
		}
	}
	
	public static String sayLastDigit(int number){
		switch(number % 10){
			case 1: return "one"; 
			case 2: return "two"; 
			case 3: return "three"; 
			case 4: return "four"; 
			case 5: return "five"; 
			case 6: return "six"; 
			case 7: return "seven"; 
			case 8: return "eight";
			case 9: return "nine"; 
			case 0: return "zero";
			default: return "It is not a number";
		}
	}
}
