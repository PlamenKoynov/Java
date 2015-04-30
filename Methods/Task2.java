import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c;
		System.out.print("a = ");
		a = in.nextInt();

		System.out.print("b = ");
		b = in.nextInt();

		System.out.print("c = ");
		c = in.nextInt();
		
		System.out.println("The biggest number is " + getMax(getMax(a, b), c) + "!");
	}
	
	public static int getMax(int first, int second){
		if(first > second){
			return first;
		}
		else{
			return second;
		}
	}
}
