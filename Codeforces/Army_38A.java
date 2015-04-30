import java.util.Scanner; 

public class Army_38A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [] years = new int [n - 1];
		int sum = 0;
		for(int i = 0; i <= n - 2; i++){
			years[i] = in.nextInt();
		}
		int a = in.nextInt();
		int b = in.nextInt();
		for(a = a - 1; a <= b - 2; a++){
			sum += years[a];
		}
		
		System.out.println(sum);
	}

}
