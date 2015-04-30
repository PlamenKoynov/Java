import java.util.Scanner;

public class CenterAlignment_5B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] lines = new String[1000];
		int index = 0;
		int max = Integer.MIN_VALUE;
		while(in.hasNextLine()){
			lines[index] = in.nextLine();
			int size = lines[index].length(); 
			if(size > max){
				max = size;
			}
			index++;
		}
		
		for(int i = 0 ; i <= max + 1; i++){
			System.out.print("*");
		}
		System.out.println();
		
		int t = 1;
		
		for(int p = 0; p <= index - 1; p++){
			String line = lines[p];
			System.out.print("*");
			int size = (max - line.length()) / 2;
			if((line.length() % 2 != 0 && max % 2 == 0)||
				line.length() % 2 == 0 && max % 2 != 0){
				if(t == 0){
					t = 1;
				}
				else{
					t = 0;
				}
			}
			for(int i = 0; i <= size - t; i++){
				System.out.print(" ");
			}
			System.out.print(line);
			
			for(int i = 0; i <= max - line.length() - size - 1; i++){
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		for(int i = 0; i <= max + 1; i++){
			System.out.print("*");
		}
		System.out.println();
	}

}
