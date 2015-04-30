import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; 
import java.io.*;

public class Task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String readFile, writeFile;
		System.out.print("Enter the file you want to open for reading: ");
		readFile = in.nextLine();
		System.out.print("Enter the file you want to open for writing: ");
		writeFile = in.nextLine();
		
		processFiles(readFile, writeFile);		
		
	}
	
	private static void processFiles(String input, String output){
		try(
				Scanner read = new Scanner(new File(input), "UTF-8");
				PrintStream write = new PrintStream(output, "UTF-8");
				){
					ArrayList<String> list = new ArrayList<String>();
					while(read.hasNextLine()){
						list.add(read.nextLine());
					}
					Collections.sort(list);
					for(String name : list){
						write.println(name);
					}
					System.out.println("Everything is ready!");
				}
		catch (FileNotFoundException fnfex){
			System.out.println("File" + input + " cannot be found!");
		}
		catch (NullPointerException npex){
			System.out.println("You haven't entered name of the file for reading!");
		}
		catch (UnsupportedEncodingException uex){
			System.out.println("Unsupported encoding!");
		}

	}

}
