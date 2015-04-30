import java.util.Scanner;
import java.util.ArrayList;

public class Winner_2A {

	static int maxScores = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			
		int size = in.nextInt();
		in.nextLine();
		
		int[][] scores = new int[size + 1][size + 1];
		ArrayList<String> names = new ArrayList<String>(size);
		int lastIndex = 0, include = 0, ind = 0;
		
		for(int i = 1; i <= size; i++){
			String name = in.next("\\w+");
			int score = in.nextInt();
			in.nextLine();
			
			if((include = names.indexOf(name)) != -1){
				scores[i][include] = score;
			}
			else{
				names.add(name);
				scores[i][lastIndex] = score;
				lastIndex++;
			}
			
			for(int j = 0; j <= lastIndex - 1; j++){
				scores[i][j] += scores[i - 1][j];
			}
			
		}
		findMaxScore(scores, lastIndex, size);
		System.out.println(names.get(getIndex(scores, lastIndex, size)));
	}

	private static void findMaxScore(int [][] results, int last, int size){
		for(int i = 0; i <= last - 1; i++){
			if(results[size][i] > maxScores){
				maxScores = results[size][i];
			}
		}
	}
	
	private static int getIndex(int[][] results, int last, int size){
		boolean flag = false;
		int index = 0;
		for(int i = 1; i <= size; i++){
			for(int j = 0; j <= last - 1; j++){
				if(results[i][j] >= maxScores && results[size][j] == maxScores){
					flag = true;
					index = j;
					break;
				}
			}
			if(flag == true){
				break;
			}
		}
		return index;
	}
}
