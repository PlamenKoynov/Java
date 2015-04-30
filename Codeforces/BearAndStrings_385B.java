import java.util.Scanner;

public class BearAndStrings_385B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String seq = in.nextLine().trim();
		System.out.println(findAll(seq));
	}
	
	private static long findAll(String line){
		int size = line.length() - 1;
		int index = 0, last = 0;
		long counter = 0;
		
		index = line.indexOf("bear");
		if(index == -1){
			counter = 0;
		}
		else{
			while(index != -1){
				counter += 1;
				counter += (size - index - 3) + (index - last) * (size - index - 2);
				last = index + 1;
				index = line.indexOf("bear", last);	
			}
		}
		return counter;
	}
}
