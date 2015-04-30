import java.util.Scanner;
import java.util.ArrayList;

public class DZY_447A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int p, size, result = 0;
		boolean flag = false;
		
		p = in.nextInt();
		size = in.nextInt();
		for(int i = 0; i <= size - 1; i++){
			int curr = in.nextInt();
			int h = curr % p;
			if(list.contains(h) && flag == false){
				result = i + 1;
				flag = true;
			}
			else if(flag == false){
					list.add(h);
				 }
		}
		if(flag == false){
			System.out.println(-1);
		}
		else{
			System.out.println(result);
		}
	}
}