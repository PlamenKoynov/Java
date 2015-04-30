import java.util.Scanner;

public class ValeraX_404A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		in.nextLine();
		char [][] matrix = new char[size][size];
		
		for(int i = 0; i <= size - 1; i++){
			String line = in.nextLine();
			for(int j = 0; j <= size - 1; j++){
				matrix[i][j] = line.charAt(j);
			}
		}
		System.out.println(checkMatrix(matrix, size));
	}
	
	private static String checkMatrix(char[][] array, int size){
		String ans = "NO";
		boolean flag = false;
		char diagonal = array[0][0];
		char other = array[0][1];
		
		if(diagonal == other){
			flag = true;
		}
		for(int i = 0; i <= size - 1; i++){
			if(flag == true){
				break;
			}
			for(int j = 0; j <= size - 1; j++){
				if(i == j || j == size - 1 - i){
					if(array[i][j] != diagonal){
						flag = true;
						break;
					}
				}
				else{
					if(array[i][j] != other){
						flag = true;
						break;
					}
				}
			}
		}
		
		if(flag == false){
			ans = "YES";
		}
		
		return ans;
	}
}
