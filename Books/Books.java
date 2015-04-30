import java.util.ArrayList;

public class Books {

	private ArrayList<String> available = new ArrayList<String>();
	private boolean[] isNotAvailableBook = new boolean[100];
	private int maxBooks = 100;
	private int index = 0;

	public void addBook(String name, String author) {
		if (index == maxBooks) {
			System.err.println("Can't add the book! There is no space!");
			return;
		}
		available.add(index + ":" + name + " - " + author);
		index += 1;
	}

	public void setBusy(int index) {
		isNotAvailableBook[index] = true;
	}

	public String printAvailable() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= available.size() - 1; i++) {
			if (isAvailable(i)) {
				sb.append(available.get(i) + "\n");
			}
		}
		return sb.toString();
	}

	public void setFree(int index) {
		isNotAvailableBook[index] = false;
	}

	public boolean isAvailable(int index) {
		return !isNotAvailableBook[index];
	}
}
