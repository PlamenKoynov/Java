import java.util.Scanner;

public class InitialBet_478A {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int [] array = new int [5];
		int sum = 0;
		
		for(int i = 0; i <= 4; i++){
			array[i] = in.nextInt();
			sum += array[i];
			for(int j = 0; j <= i - 1; j++){
				if(array[j] > array[i]){
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		
		if(sum % 5 != 0 || sum == 0){
			System.out.println(-1);
		}
		else{
			int search = sum / 5;
			int have = 0; 
			int need = 0;
			for(int i = 0; i <= 4; i++){
				if(array[i] < search){
					need += search - array[i];
				}
				else{
					have += array[i] - search;
				}
			}
			if(need == have){
				System.out.println(search);
			}
			else{
				System.out.println(-1);
			}
		}
	}
}
