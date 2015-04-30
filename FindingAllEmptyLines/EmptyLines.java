import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class EmptyLines {

	public static void main(String[] args) {
		int currentChar, counter = 0;
		boolean foundSymbol = false;
		FileReader readFile = null;
		try{ 
			readFile = new FileReader("data.txt");
			while((currentChar = readFile.read()) != -1){
				if(isForbiddenSymbol((char)currentChar)){
					foundSymbol = true;
				}
				if(isNewLine((char)currentChar)){
					if(!foundSymbol){
						counter += 1;
					}
					foundSymbol = false;
				}
			}
			if(!foundSymbol){
				counter += 1;
			}
			System.out.println("The file consists of " + counter + " empty lines!");
		}
		catch(FileNotFoundException fnf){
			System.err.println("The file is missing or is opened by other application!");
		}
		catch(IOException ioe){
			System.err.println("Something went terribly wrong during the reading!");
		}
		finally{
			try{
				if(readFile != null){
					readFile.close();
				}
			}
			catch(IOException ioExc){
				System.err.println("Somithing went terribly wrong during the closing!");
			}
		}
	}
	
	private static boolean isForbiddenSymbol(char symbol){
		boolean ans = false;
		if(symbol != (int)' ' && symbol != (int)'\n' && symbol != '\r'){
			ans = true;
		}
		return ans;	
	}
	
	private static boolean isNewLine(char symbol){
		boolean ans = false;
		if(symbol == '\n'){
			ans = true;
		}
		return ans;
	}
}
