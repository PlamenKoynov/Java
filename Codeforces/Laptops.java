import java.util.Scanner;
public class Laptops {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		in.nextLine();
		int [] price = new int [size];
		int [] quality = new int[size];
		boolean found = false;
		for(int i = 0; i <= size - 1; i++){
			price[i] = in.nextInt();
			quality[i] = in.nextInt();
			in.nextLine();
			if(found == false){
				for(int j = 0; j <= i - 1; j++){
					if(price[j] < price[i] && quality[j] > quality[i]){
						found = true;
						break;
					}
				}
			}
		}
		if(found == true){
			System.out.println("Happy Alex");
		}
		else{
			System.out.println("Poor Alex");
		}
	}

}
