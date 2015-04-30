import java.util.Scanner;

public class LuckyTicket_146A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		in.nextLine();
		String number = in.nextLine().trim();
		
		if(isLucky(number, size)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
	
	private static boolean isLucky(String num, int size){
		int sumLeft = 0, sumRight = 0;
		boolean flag = true;
		for(int i = 0; i <= size - 1; i++){
			int curr = num.charAt(i) - '0';
			if(curr != 4 && curr != 7){
				flag = false;
				break;
			}
			if(i <= (size - 1) / 2){
				sumLeft += curr; 
			}
			else{
				sumRight += curr;
			}
		}
		
		if(sumLeft != sumRight){
			flag = false;
		}
		
		return flag;
	}

}
