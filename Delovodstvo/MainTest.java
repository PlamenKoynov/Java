public class MainTest {
	public static void main(String args[]){
		try{
			Person p = new Person("Pesho", "123");
			Client c = new Client("Dimitraki", "1234", 123);
			Admin a = new Admin("Ivan", "123", "Shivach");
			Doklad d = new Doklad(a, 1, "Here!");
			System.out.println(d.sender.name);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
