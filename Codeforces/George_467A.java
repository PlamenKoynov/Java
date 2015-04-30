import java.util.Scanner;
public class George_467A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		short n = in.nextShort();
		short count = 0;
		in.nextLine();
		for(short i = 0; i <= n - 1; i++){
			short free = in.nextShort();
			short capacity = in.nextShort();
			if(free + 2 <= capacity){
				count += 1;
			}
		}
		System.out.println(count);
	}

}
