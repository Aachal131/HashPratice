import java.util.HashSet;

public class HashSet3 {

	public static void main(String args[]) {
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Arun");
		set.add("Sumit");
		System.out.println("An initial list of elements: " + set);

		System.out.println("After invoking remove(object) method: " + set);
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Ajay");
		set1.add("Gaurav");
		set.addAll(set1);
		System.out.println("Updated List: " + set);

		System.out.println("After invoking removeAll() method: " + set);

		System.out.println("After invoking removeIf() method: " + set);

		System.out.println("After invoking clear() method: " + set);
	}
}
