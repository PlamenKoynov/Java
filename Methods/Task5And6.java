import java.util.Scanner;

public class Task5And6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int checkPos, sizeOfTheArray;
		do{
			System.out.print("Enter the size of the array: ");
			sizeOfTheArray = in.nextInt();
		}while(sizeOfTheArray <= 0);
		
		int[] arr = new int [sizeOfTheArray];
		fillTheArray(arr, in);
		
		do{
			System.out.print("Enter the position you want to check: ");
			checkPos = in.nextInt();
		}while(checkPos <= 0 || checkPos > sizeOfTheArray);
		
		checkPosition(arr, checkPos - 1);
		
		int positionOfTheFirst = findFirstGreater(arr);
		if(positionOfTheFirst == -1){
			System.out.println("There is no element greater than its neighbours!");
		}
		else{
			System.out.printf("Element on position %d is greater than its neighbours!\n", positionOfTheFirst);
		}
	}
	
	public static void fillTheArray(int[] array, Scanner input){
		int size = array.length;
		for(int i = 0; i <= size - 1; i++){
			System.out.print("Element number " + (i + 1) + " : ");
			array[i] = input.nextInt();
		}
	}
	public static void checkPosition(int[] array, int pos){
		if(pos == 0){
			if(array[pos] > array[pos + 1]){
				System.out.printf("Element on position %d is greater than its neighbours!\n", pos + 1);
			}
			else if(array[pos] < array[pos + 1]){
				System.out.printf("Element on position %d is lower than its neighbours!\n", pos + 1);
			}
			else if(array[pos] == array[pos + 1]){
				System.out.printf("Element on position %d is equal to its neighbours!\n", pos + 1);
			}
			else{
				System.out.println("They are different!");
			}
		}
		else if(pos == array.length){
			if(array[pos] > array[pos - 1]){
				System.out.printf("Element on position %d is greater than its neighbours!\n", pos + 1);
			}
			else if(array[pos] < array[pos - 1]){
				System.out.printf("Element on position %d is lower than its neighbours!\n", pos + 1);
			}
			else if(array[pos] == array[pos - 1]){
				System.out.printf("Element on position %d is equal to its neighbours!\n", pos + 1);
			}
			else{
				System.out.println("They are different!");
			}

		}
		else{
			if(array[pos] < array[pos - 1] && array[pos] < array[pos + 1]){
				System.out.printf("Element on position %d is lower than its neighbours!\n", pos + 1);
			}
			else if(array[pos] > array[pos - 1] && array[pos] > array[pos + 1]){
				System.out.printf("Element on position %d is greater than its neighbours!\n", pos + 1);
			}
			else if(array[pos] == array[pos - 1] && array[pos + 1] == array[pos - 1]){
				System.out.printf("Element on position %d is equal to its neighbours!\n", pos + 1);
			}
			else{
				System.out.println("They are different!");
			}
		}
	}
	
	public static int findFirstGreater(int[] array){
		int size = array.length;
		for(int i = 0; i <= size - 1; i++){
			if(i == 0){
				if(array[i] > array[i + 1]){
					return (i + 1);
				}
			}
			else if(i == size - 1){
				if(array[i] > array[i - 1]){
					return (i + 1);
				}
			}
			else{
				if(array[i] > array[i - 1] && array[i] > array[i + 1]){
					return (i + 1);
				}
			}
		}
		return -1;
	}
}
