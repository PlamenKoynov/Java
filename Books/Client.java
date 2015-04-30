import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

	public static Scanner inKey = new Scanner(System.in);
	public static final int port = 1234;
	public static final String host = "localhost";

	public static void main(String args[]) {

		DataInputStream in = null;
		DataOutputStream out = null;
		Socket socket = null;

		try {
			socket = new Socket(host, port);
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
		} catch (IOException io) {
			System.err.println(io.getMessage());
			return;
		}

		System.out.println("Connection established!");

		try {
			do {
				String command;
				System.out.println(in.readUTF());
				System.out.print("Enter command: ");
				command = inKey.nextLine();
				out.writeUTF(command.trim());
				if (command.equalsIgnoreCase("exit")) {
					break;
				}
			} while (true);
		} catch (IOException io) {
			System.err.println(io.getMessage());
		} finally {
			try {
				if (socket != null) {
					socket.close();
				}
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (IOException io) {
				System.err.println(io.getMessage());
			}
		}
	}
}
