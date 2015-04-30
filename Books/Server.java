import java.io.*;
import java.net.*;

public class Server {

	public final static int port = 1234;

	public static void main(String[] args) {

		ServerSocket server = null;
		Books books = new Books();
		books.addBook("Ivan Vazov", "Pod igoto");
		books.addBook("Samo", "Proba");
		books.addBook("Oshte edin", "Tekstov dokument");

		while(true){
			try {
				server = new ServerSocket(port);
				System.out.println("Server is listening...");
				BookReader reader = new BookReader(server.accept(), books);
				reader.start();
			} catch (IOException io) {
				System.err.println(io.getMessage());
			} finally {
				if (server != null) {
					try {
						server.close();
					} catch (IOException e) {
						System.err.println(e.getMessage());
					}
				}
			}
		}
	}

}
