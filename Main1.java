

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main1 {

	public static void addArrayList(Map<Integer, ArrayList<String>> hm1, Integer key, String value) {
		ArrayList<String> al1 = new ArrayList<>();
		al1.add(value);
		hm1.put(key, al1);
	}

	public static void displayList(Map<Integer, ArrayList<String>> hm1) {
		for (Map.Entry<Integer, ArrayList<String>> entry : hm1.entrySet()) {
			Integer key = entry.getKey();
			ArrayList<String> values = entry.getValue();
			System.out.println("Key: " + key + ", Values " + values);
		}
	}

	public static void main(String[] args) {

		Map<Integer, ArrayList<String>> ht = new HashMap<>();
		addArrayList(ht, 1, "Pune");
		addArrayList(ht, 2, "Mumbai");
		addArrayList(ht, 3, "Navi Mumbai");
		displayList(ht);
	}
}