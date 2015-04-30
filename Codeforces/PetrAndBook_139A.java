import java.util.Scanner;

public class PetrAndBook_139A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] days = new int[7];
		long sum = 0L;
		int n = in.nextInt();
		for(int i = 0; i <= 6; i++){
			days[i] = in.nextInt();
			sum += days[i];
		}
		
		while(sum < n){
			n -= sum;
		}
		
		System.out.println(findDay(days, n));
	}

	private static int findDay(int[]days, int pages){
		int result = 1;
		while(pages > 0){
			for(int i = 0; i <= 6; i++){
				pages -= days[i];
				if(pages <= 0){
					result = i + 1;
					break;
				}
				if(pages > 0 && i == 6){
					i = 0;
				}
			}
		}
		return result;
	}
}
