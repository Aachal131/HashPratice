
import java.util.*;

class Book_Main {

	int id;
	String name, author, publisher;
	int quantity;

	public Book_Main(int id, String name, String author, String publisher, int quantity) {

		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Book_Main> set = new HashSet<Book_Main>();

		Book_Main b2 = new Book_Main(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);

		Book_Main b3 = new Book_Main(103, "Operating System", "Galvin", "Wiley", 6);

		set.add(b2);
		set.add(b3);

		for (Book_Main b : set) {

			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}