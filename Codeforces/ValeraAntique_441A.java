import java.util.Scanner;
import java.util.ArrayList;

public class ValeraAntique_441A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int seller = in.nextInt();
		int counter = 0;
		ArrayList<Integer> list = new ArrayList<Integer>(50);
		long money = in.nextLong();
		in.nextLine();
		for(int i = 0; i <= seller - 1; i++){
			int items = in.nextInt();
			boolean flag = false;
			for(int j = 0; j <= items - 1; j++){
				long price = in.nextLong();
				if(flag == false && price < money){
					flag = true;
					counter += 1;
					list.add(i + 1);
				}
			}
		}
		System.out.println(counter);
		for(int sell : list){
			System.out.print(sell + " ");
		}
	}

}
