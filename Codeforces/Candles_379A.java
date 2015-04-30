import java.util.Scanner;
public class Candles_379A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int counter = a;
		while(a > 0){
			a -= b;
			a += 1;
			if(a > 0){
				counter += 1;
			}
		}
		System.out.println(counter);
	}

}
