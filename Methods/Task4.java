import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sizeOfTheArray;
		do{
			System.out.print("Enter the size of the array: ");
			sizeOfTheArray = in.nextInt();
		}while(sizeOfTheArray <= 0);
		
		int[] arr = new int [sizeOfTheArray];
		int searchNumber; 
		
		fillTheArray(arr, /*sizeOfTheArray,*/ in);
		printTheArray(arr);
		System.out.print("Which number you are looking for: ");
		searchNumber = in.nextInt();
		System.out.println("There are " + findNumber(arr, /*sizeOfTheArray,*/ searchNumber) + " numbers " + searchNumber + "!");
	}
	
	/*public static void fillTheArray(int[] array, int size, Scanner input){
		for(int i = 0; i <= size - 1; i++){
			System.out.print("Element number " + (i + 1) + " : ");
			array[i] = input.nextInt();
		}
	}
	
	public static int findNumber(int[] array, int size, int search){
		int counter = 0;
		for(int i = 0; i <= size - 1; i++){
			if(array[i] == search){
				++counter;
			}
		}
		return counter;
	}*/
	
	public static void fillTheArray(int[] array, Scanner input){
		int size = array.length;
		int curr;
		for(int i = 0; i <= size - 1; i++){
			System.out.print("Element number " + (i + 1) + " : ");
			if(i == 0){
				array[i] = input.nextInt();
			}
			else{
				curr = input.nextInt();
				int j = 0;
				for(j = 0; j <= i - 1; j++){
					if(array[j] > curr){
						for(int p = i - 1; p >= j; p--){
							array[p + 1] = array[p];
						}
						break;
					}
				}
				array[j] = curr;
			}
		}
	}
	
	public static void printTheArray(int[] array){
		for(int element : array){
			System.out.print(element + " ");
			System.out.println();
		}
	}
	public static int findNumber(int[] array, int search){
		int size = array.length;
		int counter = 0;
		for(int i = 0; i <= size - 1; i++){
			if(array[i] == search){
				++counter;
			}
		}
		return counter;
	}
}
