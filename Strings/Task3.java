import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder changed = new StringBuilder(); 
		
		System.out.print("Enter the text you want to change: ");
		while(in.hasNext()){
			changed.append(in.nextLine());
		}
		System.out.print(replacer(changed));
	}
	
	public static String replacer(StringBuilder original){
		int indexFrom, indexTo;
		String searchOpen = "<upcase>", searchClose = "</upcase>";
		indexFrom = original.indexOf(searchOpen);
		while(indexFrom != -1){
			indexTo = original.indexOf(searchClose, indexFrom);
			original.replace(indexFrom, indexTo + 9, original.substring(indexFrom + 8, indexTo).toUpperCase());
			indexFrom = original.indexOf(searchOpen, indexTo);
		}
		return original.toString();
	}
}
