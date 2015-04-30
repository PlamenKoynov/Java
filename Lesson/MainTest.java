import java.util.Scanner;
public class MainTest {
	public static void main(String args[]){
		try{
			ClassA a = new ClassA("sin", 2);
			System.out.println(a.getCvyat() + " " + a.getChislo());
			a.setChislo(a.getChislo() + 1);
			System.out.println(a.getCvyat() + " " + a.getChislo());
			
			ClassB b = new ClassB("cherven", 10,  false);
			System.out.println(b.getCvyat());
		}
		catch(Exception e){
			System.err.println("Chisloto e otricatelno ili 0!");
		}
		Scanner sc = new Scanner(System.in);
		ClassA [] temp = new ClassA[4];
		for(int i = 0; i <= 3; i++){
			temp[i] = new ClassA();
			System.out.print("Cvyat: ");
			String line = sc.next();
			temp[i].setCvyat(line);
			System.out.print("Chislo: ");
			int ch = sc.nextInt();
			temp[i].setChislo(ch);
		}
		
		for(ClassA b : temp){
			System.out.println(b.getCvyat() + " " + b.getChislo());
		}
	}
}
