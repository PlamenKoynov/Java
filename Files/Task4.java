import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String fileRead;
		System.out.print("Enter the name of the file you want to open for reading: ");
		fileRead = in.nextLine();
		
		System.out.println("There were " + findAndReplace(fileRead) + " occurences of the word start!");
	}
	
	private static int findAndReplace(String input){
		int counter = 0;
		try(
				Scanner read = new Scanner(new File(input), "UTF-8");
				)
				{
					String line; 
					int index;
					while(read.hasNextLine()){
						line = read.nextLine();
						Pattern pattern = Pattern.compile("\\bstart\\b");
						Matcher matcher = pattern.matcher(line);

						while (matcher.find()) {
						    counter++;
						}
					}
				}
		catch(FileNotFoundException fnfex){
			System.out.println("File " + input + " cannot be found!");
		}
		return counter;
	}
}
