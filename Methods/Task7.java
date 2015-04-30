import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number;
		do{
			System.out.print("Enter the number you want to reverse: ");
			number = in.nextInt();
		}while(number <= 0);
		
		System.out.print("Reversed number: ");
		reverseNumber(number);
	}
	
	public static void reverseNumber(int num){
		while(num != 0){
			System.out.print(num % 10);
			num /= 10;
		}
		System.out.println();
	}

}
