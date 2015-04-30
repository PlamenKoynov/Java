import java.util.Scanner;
import java.io.*;

public class Task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String readFile, writeFile; 
		System.out.print("Enter the name of the file you want to open for reading: ");
		readFile = in.nextLine();
		System.out.print("Enter the name of the file you want to open for writing: ");
		writeFile = in.nextLine();
		
		findMaxSum(getMatrix(readFile), writeFile);
	}

	private static long[][] getMatrix(String input){
		long[][] array = null;
		try(
				Scanner read = new Scanner(new File(input), "UTF-8");
				)
				{
					int rows = read.nextInt();
					array = new long[rows][rows];
					for(int i = 0; i <= rows - 1; i++){
						for(int j = 0; j <= rows - 1; j++){
							array[i][j] = read.nextInt();
						}
					}
				}
		catch(FileNotFoundException fnfex){
			System.out.println("File " + input + " cannot be found!");
		}
		return array;
	}
	private static void findMaxSum(long[][] matrix, String output){
		try(
				PrintStream write = new PrintStream(new File(output), "UTF-8");
				)
				{
					int size;
					long sum = 0;
					long maxSum = Long.MIN_VALUE;
					if(matrix == null){
						System.out.println("An error occured!");
						return;
					}
					size = matrix[0].length;
					for(int i = 0; i <= size - 2; i++){
						for(int j = 0; j <= size - 2; j++){
							sum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1]; 
							if(sum > maxSum){
								maxSum = sum;
							}
						}
					}
					write.println("Max sum is: " + maxSum);
					System.out.print("Everything is ready!");
				}
		catch (FileNotFoundException fnfex){
			System.out.println("Some process has opend the file you want to open for writing!");
		}
		catch (UnsupportedEncodingException uex){
			System.out.println("Wrong encoding in document " + output + " !");
		}
	}
}
