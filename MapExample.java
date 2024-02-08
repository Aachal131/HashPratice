import java.util.*;

class BookMain {
	int id;
	String name, author, publisher;
	int quantity;

	public BookMain(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class MapExample {
	public static void main(String[] args) {

		Map<Integer, BookMain> map = new HashMap<Integer, BookMain>();

		BookMain b1 = new BookMain(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		BookMain b2 = new BookMain(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		BookMain b3 = new BookMain(103, "Operating System", "Galvin", "Wiley", 6);

		map.put(1,b1);
		map.put(2, b2);
		map.put(3, b3);


		for (Map.Entry<Integer, BookMain> entry : map.entrySet()) {
			int key = entry.getKey();
			BookMain b = entry.getValue();
			System.out.println(key + " Details:");
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}