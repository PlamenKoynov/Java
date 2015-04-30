import java.util.Scanner;

public class Eevee_452A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String [] pokemons = {"jolteon", "flareon", "umbreon", "leafeon", "glaceon", "sylveon"};
		int size = in.nextInt();
		in.nextLine();
		String searchWord = in.nextLine();
		if(size == 6){
			System.out.println("espeon");
		}
		else if(size == 8){
			System.out.println("vaporeon");
		}
		else{
			for(String poke : pokemons){
				boolean found = true;
				for(int i = 0; i <= size - 1; i++){
					if(searchWord.charAt(i) != '.'){
						if(poke.charAt(i) != searchWord.charAt(i)){
							found = false;
							break;
						}
					}
				}
				if(found == true){
					System.out.println(poke);
					break;
				}
			}
		}
	}
}
