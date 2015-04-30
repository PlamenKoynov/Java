import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ban;
		StringBuilder censored = new StringBuilder();
		int indexFrom;

		System.out.print("Enter the banned words: ");
		ban = in.nextLine();
		String[] banned = ban.split("[ .,]+");
		
		System.out.print("Enter the text you want to censor: ");
		
		while(in.hasNext()){
			censored.append(in.nextLine());
		}
		for(String forbidden : banned){
			indexFrom = censored.indexOf(forbidden);
			while(indexFrom != -1){
				censored.replace(indexFrom, indexFrom + forbidden.length(), getCensored(forbidden.length()));
				indexFrom = censored.indexOf(forbidden, indexFrom + 1);
			}
		}
		System.out.print(censored);
	}
	
	public static String getCensored(int size){
		StringBuilder result = new StringBuilder();
		for(int i = 0; i <= size - 1; i++){
			result.append("*");
		}
		return result.toString();
	}
}
