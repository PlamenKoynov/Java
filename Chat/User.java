import java.net.*;
import java.io.*;
import java.util.*;

public class User implements Runnable{
	
	private Socket socket = null; 
	private DataInputStream in = null;
	private DataOutputStream out = null;
	private String name;
	
	public User(Socket socket){
		this.socket = socket;
	}
	
	public void run(){
		try{
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
		}catch(IOException io){
			System.err.println("Can't get the streams!");
			return;
		}
		
		System.out.println("Connection established!");
		
		try {		
			do{
				out.writeUTF("Username:");
				name = in.readUTF();
			}while(Server.checkUsers(name));
			out.writeUTF("READY");
			
			Server.addUser(this);
			
			String message; 
			do{
				message = in.readUTF();
				Server.sendMessage(message);
			}while(!message.equalsIgnoreCase("quit"));
			
			Server.sendMessage(this.getName() + "left the conversation!");
			Server.remove(this);
			
		}catch(IOException io){
			System.err.println("Something happened!");
			return;
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
				System.err.println("Can't close something!");
			}
		}
	}
	
	public String getName(){
		return name;
	}
	
	public synchronized void send(String message){
		try{
			out.writeUTF(this.getName() + ": " + message);
		}catch(IOException io){
			System.err.println("Can't deliver the message!");
			return;
		}
	}
}
