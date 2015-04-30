import java.io.*;
import java.net.*;

public class BookReader extends Thread{

	private Socket connection;
	private Books books;

	public BookReader(Socket connection, Books books) {
		this.connection = connection;
		this.books = books;
	}

	public void run() {

		String command = null;
		DataInputStream in = null;
		DataOutputStream out = null;
		BufferedReader bufferedFile = null;
		boolean isSelectedBook = false;
		boolean exit = false;
		String file = null;

		try {
			in = new DataInputStream(connection.getInputStream());
			out = new DataOutputStream(connection.getOutputStream());
			
		} catch (IOException e) {
			System.err.println("The writer has gone!");
			return;
		}

		try{
			out.writeUTF("You have connected to the server!\nAwaiting commands...");
			do {
				command = in.readUTF();
				if (command.equals("LIST")) {
					out.writeUTF("OK!\n"
							+ "List of available books:\n"
							+ books.printAvailable());
			} else {
				if (command.substring(0, 3).equals("USE")) {
					out.writeUTF("OK!");
					file = command.substring(4, command.length());
					books.setBusy(Integer.parseInt(file));
					isSelectedBook = true;
				} else {
					if (command.equals("LINES")) {
						if (!isSelectedBook) {
							out.writeUTF("Error! There is no selected book!");
						} else {
							int countLines = 0;
							try {
								bufferedFile = new BufferedReader(new FileReader(file
										+ ".txt"));
								while (bufferedFile.readLine() != null) {
									countLines += 1;
								}
								bufferedFile.close();
							} catch (IOException e) {
								System.err.println(e.getMessage());
							}
							out.writeUTF("OK!\n" + countLines);
						}
					} else {
						if (command.substring(0, 4).equals("READ")) {
							if (!isSelectedBook) {
								out.writeUTF("Error! There is no selected book!");
							} else {
								bufferedFile = new BufferedReader(new FileReader(file
										+ ".txt"));
								int startIndex = 0, endIndex = 0;
								if (command.lastIndexOf(" ") == 4) {
									endIndex = Integer.parseInt(command
											.substring(5));
								} else {
									startIndex = Integer.parseInt(command
											.substring(5,
													command.lastIndexOf(" ")));
									endIndex = Integer.parseInt(command
											.substring(
													command.lastIndexOf(" ") + 1,
													command.length()));
								}
								try {
									String line;
									int counter = 0;
									boolean readLine = false;
									StringBuilder sb = new StringBuilder();
									while ((line = bufferedFile.readLine()) != null) {
										if (counter >= startIndex
												&& counter <= endIndex) {
											sb.append(line);
											readLine = true;
										}
										counter += 1;
									}
									bufferedFile.close();
									if (!readLine) {
										out.writeUTF("Error! Wrong index!");
									}
									else{
										out.writeUTF("OK!\n" + sb.toString());
									}
								} catch (IOException io) {
									System.err.println(io.getMessage());
								}
							}
						} else {
							if (command.equals("EXIT")) {
								exit = true;
								out.writeUTF("OK!");
								try {
									if (in != null) {
										in.close();
									}
									if(out != null){
										out.close();
									}
									if (bufferedFile != null) {
										bufferedFile.close();
									}
									isSelectedBook = false;
									books.setFree(Integer.parseInt(file));
								} catch (IOException io) {
									System.err.println(io.getMessage());
								}
							}
						}
					}
				}
			}
		} while (!exit);
		}catch(IOException io){
			System.err.println(io.getMessage());
		}
	}
}
