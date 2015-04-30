import java.util.Scanner;

public class RemovingColumns {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char letters [][] = new char[100][100];
		
		int counter = 0;
		int n = in.nextInt();
		int m = in.nextInt();
		
		for(int i = 0; i <= n - 1; i++){
			String line = in.next();
			for(int j = 0; j <= m - 1; j++){
				letters[i][j] = line.charAt(j);
			}
		}
		
		for(int i = 0; i <= n - 2; i++){
			int remove = -1;
			for(int j = 0; j <= n - 1; j++){
				if(letters[i][j] > letters[i + 1][j] && (letters[i][j] != '1' || letters[i + 1][j] != '1')){
					for(int k = 0; k <= n - 1; k++){
						letters[k][j] = '1';
					}
					counter += 1;
				}
			}
		}
		System.out.println(counter);
	}
}
