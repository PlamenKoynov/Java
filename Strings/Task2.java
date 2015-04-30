import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text;
		int index, counter = 0;
		
		System.out.print("Enter the text you want to search: ");
		text = in.nextLine();
		text = text.toLowerCase();
		index = text.indexOf("in");
		while(index != -1){
			++counter; 
			index = text.indexOf("in", index + 1);
		}
		System.out.printf("There are %d 'in' in the text!\n", counter);
	}

}
