import java.net.*;
import java.io.*;
import java.util.*;

public class Server {

	private final static int port = 1234;
	private static ArrayList<User> users = new ArrayList<User>();
	public static void main(String args[]){
		
		ServerSocket socket = null;
		
		try{
			socket = new ServerSocket(port);
			while(true){
				User user = new User(socket.accept());
				new Thread(user).start();
			}
		}catch(IOException io){
			System.err.println("Can't make server part!");
			return;
		}
		finally{
			if(socket != null){
				try {
					socket.close();
				} catch (IOException e) {
					System.err.println("Can't close the socket!");
				}
			}
		}
	}
	
	public synchronized static boolean checkUsers(String name){
		for(User user: users){	
			if(user.getName().equals(name)){
				return true;
			}
		}
		return false;
	}
	
	public synchronized static void addUser(User user){
		users.add(user);
	}
	
	public synchronized static void sendMessage(String message){
		for(User user : users){
			user.send(message);
		}
	}
	
	public synchronized static void remove(User user){
		users.remove(user);
	}
}
