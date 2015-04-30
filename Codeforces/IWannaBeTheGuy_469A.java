import java.util.Scanner;

public class IWannaBeTheGuy_469A {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int levels = in.nextInt();
		int [] passed = new int [levels];
		int counter = 0;
		int x = in.nextInt();
		for(int i = 0; i <= x - 1; i++){
			int a = in.nextInt();
			if(passed[a - 1] == 0){
				counter += 1;
				passed[a - 1] = 1;
			}
		}
		int y = in.nextInt();
		for(int i = 0; i <= y - 1; i++){
			int a = in.nextInt();
			if(passed[a - 1] == 0){
				counter += 1;
				passed[a - 1] = 1;
			}
		}
		
		if(counter == levels){
			System.out.println("I become the guy.");
		}
		else{
			System.out.println("Oh, my keyboard!");
		}
	}

}
