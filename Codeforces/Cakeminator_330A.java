import java.util.Scanner;

public class Cakeminator_330A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, y;
		x = in.nextInt();
		y = in.nextInt();
		in.nextLine();
		System.out.println(findEdible(in, x,y));
	}
	
	private static int findEdible(Scanner input, int sizeX, int sizeY){
		char [][] matrix = new char[sizeX + 1][sizeY + 1];
		for(int i = 0; i <= sizeX - 1; i++){
			String line = input.nextLine();
			for(int j = 0; j <= sizeY - 1; j++){
				matrix[i][j] = line.charAt(j);
			}
		}
	
		return findCells(matrix, sizeX, sizeY);
	}

	private static int findCells(char array[][], int first, int second){
		boolean flag = false;
		int counter = 0, add = 0;
		for(int i = 0; i <= first - 1; i++){
			for(int j = 0; j <= second - 1; j++){
				if(array[i][j] == 'S'){
					flag = true;
					break;
				}
			}
			if(flag == false){
				for(int j = 0; j <= second - 1; j++){
					if(array[i][j] == '.'){
						add += 1;
						array[i][j] = '0';
					}
				}
				counter += add;
			}
			flag = false;
			add = 0;
		}
		
		for(int i = 0; i <= first - 1; i++){
			for(int j = 0; j <= second - 1; j++){
				if(array[i][j] == 'S'){
					flag = true;
					break;
				}
			}
			if(flag == false){
				for(int j = 0; j <= second - 1; j++){
					if(array[i][j] == '.'){
						add += 1;
						array[i][j] = '0';
					}
				}
				counter += add;
			}
			flag = false;
			add = 0;
		}
		
		for(int i = 0; i <= second - 1; i++){
			for(int j = 0; j <= first - 1; j++){
				if(array[j][i] == 'S'){
					flag = true;
					break;
				}
			}
			if(flag == false){
				for(int j = 0; j <= first - 1; j++){
					if(array[j][i] == '.'){
						add += 1;
						array[j][i] = '0';
					}
				}
				counter += add;
			}
			flag = false;
			add = 0;
		}
		return counter;
	}
}
