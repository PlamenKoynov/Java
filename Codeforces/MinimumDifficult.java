import java.util.Scanner;

public class MinimumDifficult {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int hangs[] = new int [n];
		int difference [] = new int [n];
		
		for(int i = 0; i <= n - 1; i++){
			hangs[i] = in.nextInt();
		}
		

		int min = Integer.MAX_VALUE;
		int counter = 0;
		
		if(n == 3){
			System.out.println(hangs[n - 1] - hangs[0]);
		}
		else{
			for(int i = 1; i <= n - 2; i++){
				int temp = hangs[0];
				hangs[0] = hangs[i];
				hangs[i] = temp;
				
				int max = 0;
				for(int j = 1; j <= n - 2; j++){
					int diff = hangs[j + 1] - hangs[j];
					if(diff > max){
						max = diff;
					}
				}
				
				difference[counter] = max;
				counter++;
			}
			
			for(int i = 0; i <= counter - 1; i++){
				if(difference[i] < min){
					min = difference[i];
				}
			}
			
			System.out.println(min);
		}
	}
}
