import java.util.Scanner;
public class Diamond_454A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int spaces = size / 2;
		int middle = spaces;
		//upper part + the middle
		for(int i = 0; i <= middle; i++){
			for(int j = 0; j <= spaces - 1; j++){
				System.out.print("*");
			}
			for(int j = 0; j <= size - 2 * spaces - 1; j++){
				System.out.print("D");
			}
			for(int j = 0; j <= spaces - 1; j++){
				System.out.print("*");
			}
			System.out.println();
			spaces -= 1;
		}
		
		spaces = 1;
		//lower part
		for(int i = 0; i <= middle - 1; i++){
			for(int j = 0; j <= spaces - 1; j++){
				System.out.print("*");
			}
			for(int j = 0; j <= size - 2 * spaces - 1; j++){
				System.out.print("D");
			}
			for(int j = 0; j <= spaces - 1; j++){
				System.out.print("*");
			}
			System.out.println();
			spaces += 1;
		}
	}

}
