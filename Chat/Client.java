import java.net.*;
import java.io.*;
import java.util.*;

public class Client {
	
	public static int port = 1234;
	public static String host = "localhost";
	public static void main(String args[]){
		
		Socket socket = null;
		DataInputStream in = null;
		DataOutputStream out = null;
		
		try{
			socket = new Socket(host, port);
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
		}catch(IOException io){
			System.err.println("Can't connect to server!");
		}
		
		System.out.println("Connection established!");
		
		String message; 
		Scanner sc = new Scanner(System.in);
		try{
			while(!(message = in.readUTF()).equals("READY")){
				System.out.println(message);
				String name = sc.nextLine().trim();
				out.writeUTF(name);
			}
			
			do{
				System.out.print("Message: ");
				message = sc.nextLine().trim();
				out.writeUTF(message);
				out.flush();
				System.out.println(in.readUTF());
			}
			while(message.equalsIgnoreCase("quit"));
		}catch(IOException io){
			System.err.println("Problems with the message!");
		}
		finally{
			try{
				if(socket != null){
					socket.close();
				}
				if(in != null){
					in.close();
				}
				if(out != null){
					out.close();
				}
			}catch(IOException io){
				System.err.println("Can't close all!");
				return;
			}
		}
	}
}
