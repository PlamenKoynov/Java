import java.util.Scanner;
public class GameWithSticks_451A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		short n = in.nextShort();
		short m = in.nextShort();
		short low = min(n , m);
		if(low % 2 == 0){
			System.out.println("Malvika");
		}
		else{
			System.out.println("Akshat");
		}
	}
	
	private static short min(short first, short second){
		short ans = first;
		if(first > second){
			ans = second;
		}
		return ans;
	}

}
