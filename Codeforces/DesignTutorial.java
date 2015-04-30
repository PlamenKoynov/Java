import java.util.Scanner;
public class DesignTutorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 4; i <= n - 4; i++){
			if(isComposite(i) && isComposite(n - i)){
				System.out.println(i + " " + (n - i));
				break;
			}
		}
	}
	
	private static boolean isComposite(int num){
		boolean answer = false;
		for(int i = 2; i <= num / 2; i++){
			if(num % i == 0){
				answer = true;
				break;
			}
		}
		return answer;
	}

}
