import java.util.Scanner; 
import java.io.*;

public class Task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String fileName = null;
		System.out.print("Enter the name of the file you want to open for reading: ");
		fileName = in.nextLine();
		try (
				Scanner fileReader = new Scanner(new File(fileName), "UTF-8");
			){
				String line;
				while(fileReader.hasNextLine()){
					line = fileReader.nextLine();
					System.out.println(line);
					if(fileReader.hasNextLine()){
						fileReader.nextLine();
					}
				}
		}
		catch (FileNotFoundException fnfex){
			System.out.println("File " + fileName + " cannot be found!");
		}
		catch (NullPointerException npex){
			System.out.println("You haven't entered filename!");
		}
	}

}
