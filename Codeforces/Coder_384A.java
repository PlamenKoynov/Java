import java.util.Scanner;

public class Coder_384A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		System.out.println(findNumber(size));
		printMatrix(size);
	}

	private static long findNumber(int size){
		long number = 0, increase = 0;
		if(size % 2 != 0){
			increase = 1;
		}
		number += (size / 2 + increase) * (size / 2 + increase) + (size / 2) * (size / 2);
		return number;
	}
	
	private static void printMatrix(int size){
		StringBuilder firstLine = new StringBuilder(size);
		StringBuilder secondLine = new StringBuilder(size);
		
		for(int i = 0; i <= size - 1; i++){
			if(i % 2 == 0){
				firstLine.append("C");
				secondLine.append(".");
			}
			else{
				firstLine.append(".");
				secondLine.append("C");
			}
		}
		
		for(int i = 0; i <= size - 1; i++){
			if(i % 2 == 0){
				System.out.println(firstLine);
			}
			else{
				System.out.println(secondLine);
			}
		}
	}
}
