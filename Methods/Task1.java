import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		System.out.print("Enter the name: ");
		name = in.next("\\w+");
		greetSomeone(name);
	}
	
	public static void greetSomeone(String person){
		System.out.println("Hello, " + person + "!");
	}
}
