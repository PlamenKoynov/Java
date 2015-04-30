import java.util.Scanner; 

public class kString_219A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		in.nextLine();
		String s = in.nextLine(); 
		s = s.trim();
		System.out.println(findSubstr(k, s));
	}

	private static String findSubstr(int size, String word){
		int len = word.length();
		int [] seq = new int [26];
		int first = 0, min = Integer.MAX_VALUE; 
		boolean flag = false;
		String result = "", base = "";
		
		for(int i = 0; i <= len - 1; i++){
			seq[word.charAt(i) - 'a'] += 1;
		}
			
		for(int i = 0; i <= 25; i++){
			if(seq[i] != 0){
				if((seq[i] >= size && seq[i] % size != 0) || (seq[i] < size)){
					return "-1";
				}
				for(int j = 0; j <= (seq[i] / size) - 1; j++){
					base += (char)(i + 'a');
				}
			}
		}
		
		for(int i = 0; i <= size - 1; i++){
			result += base;
		}
		return result;
	}
}
