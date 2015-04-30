import java.util.Scanner;
public class CircleLine_278A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] distance = new int[size];
		int first, second, ac = 0, dc = 0;
		in.nextLine();
		for(int i = 0; i <= size - 1; i++){
			distance[i] = in.nextInt();
		}
		in.nextLine();
		first = in.nextInt();
		second = in.nextInt();
		if(first > second){
			int temp = first;
			first = second;
			second = temp;
		}
		
		ac = findDistance(distance, first - 1, second - 2);
		dc = findDistance(distance, 0, first - 2) + findDistance(distance, second - 1, size - 1);		
		System.out.println(min(ac, dc));
	}

	private static int findDistance(int [] searchDistance, int start, int end){
		int result = 0;
		for(int i = start; i <= end; i++){
			result += searchDistance[i];
		}
		return result;
	}
	private static int min(int a, int b){
		int result = a;
		if(a > b){
			result = b;
		}
		return result;
	}
}
