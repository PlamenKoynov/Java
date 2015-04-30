import java.util.Scanner;

public class ChatServer_5A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int countGuests = 0, chars = 0;
		while(in.hasNextLine()){
			String line = in.nextLine();
			char ch = line.charAt(0);
			if(ch != '+' && ch != '-'){
				int index = line.indexOf(":");
				int size = line.length() - 1;
				chars += countGuests * (size - index);
			}
			if(ch == '+'){
				++countGuests;
			}
			if(ch == '-'){
				--countGuests;
			}
		}
		System.out.println(chars);
	}

}
