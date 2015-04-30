import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public class TextFile {

	private FileReader readFrom;
	
	public TextFile(){
		this.readFrom = null;
	}
	public TextFile(String file){
		try{
			this.readFrom = new FileReader(file);
		}
		catch(FileNotFoundException fnf){
			System.err.println(file + " doesn't exist or is ocuppied by other process!");
		}		
	}
	
	public int countEmpty(){
		int currentChar, countEmpty = 0;
		boolean foundForbidden = false;
		try{
			while((currentChar = readFrom.read()) != -1){
				if(isForbiddenSymbol((char)currentChar)){
					foundForbidden = true;
				}
				if(isEndLine((char)currentChar)){
					if(!foundForbidden){
						countEmpty += 1;
					}
					foundForbidden = false;
				}
			}
		}
		catch(IOException ioexc){
			System.err.println("Something went terribly wrong!");
		}
		finally{
			try{
				if(readFrom != null){
					readFrom.close();
				}
			}
			catch(IOException ioexc){
				System.err.println("Something went terribly wrong!");
			}
		}
		return countEmpty;
	}
	
	public void findMax(){
		StringBuilder sb = new StringBuilder();
		int currentChar, max = 0;
		boolean foundForbidden = false;
		boolean separator = false;
		ArrayList<String> maxWords = new ArrayList<String>();
		try{
			while((currentChar = readFrom.read()) != -1){
				if(isSymbol((char)currentChar) && !(separator = isSeparator((char)currentChar))){
					foundForbidden = true;
				}
				if(!separator){
					sb.append((char)currentChar);
				}
				if(separator){
					if(!foundForbidden && max <= sb.length()){
						if(max < sb.length()){
							maxWords.clear();
						}
						if(!maxWords.contains(sb.toString())){
							maxWords.add(sb.toString());
						}
						max = sb.length();
					}
					sb.setLength(0);
					foundForbidden = false;
					separator = false;
				}
			}
			
			if(maxWords.isEmpty()){
				System.out.println("There are no words!");
			}
			else{
				System.out.println("The maximal length is " + max + "! All words: ");
				for(String word : maxWords){
					System.out.println(word);
				}
			}
		}
		catch(IOException ioexc){
			System.err.println("Something went terribly wrong!");
		}
		finally{
			try{
				if(readFrom != null){
					readFrom.close();
				}
			}
			catch(IOException ioexc){
				System.err.println("Something went terribly wrong!");
			}
		}
	
		
	}
	private static boolean isForbiddenSymbol(char symbol){
		boolean ans = false;
		if(symbol != ' ' && symbol != '\r' && symbol != '\n'){
			ans = true;
		}
		return ans;
	}
	
	private static boolean isEndLine(char symbol){
		boolean ans = false;
		if(symbol == '\n'){
			ans = true;
		}
		return ans;
	}
	
	private static boolean isSymbol(char symbol){
		boolean ans = false;
		if(symbol < 'A' || (symbol > 'Z' && symbol < 'a') || symbol > 'z'){
			ans = true;
		}
		return ans;
	}
	
	private static boolean isSeparator(char symbol){
		char [] separators = {' ', '\r', '\n', '!', '.', ',', '?', '-', ';', ':', '\t'};
		boolean ans = false;
		for(char separator : separators){
			if(symbol == separator){
				ans = true;
				break;
			}
		}
		return ans;
	}
}
