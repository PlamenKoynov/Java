
public class SumOfLetters {
	public static void main(String args[]){
		String line = "abc123AB";
		int size = line.length();
		int sum = 0;
		
		for(int i = 0; i <= size - 1; i++){
			char ch = line.charAt(i);
			if(ch >= 'a' && ch <= 'z'){
				sum += (int)ch - (int)'a' + 1;
			}
			else if(ch >= 'A' && ch <= 'Z'){
				sum += 2 * ((int)ch - (int)'A' + 1);
			}
			else if(ch >= '0' && ch <= '9'){
				sum += (int)ch - '1' + 1;
			}
			System.out.println(ch + " " + sum);
		}
		System.out.println(sum);
	}
}
