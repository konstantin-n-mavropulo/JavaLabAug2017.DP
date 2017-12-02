package lesson171129;

import java.util.Iterator;

public class UseList {
	
	public static void main(String[] args) {
		
		MyList<String> list = new MyList<>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		
//		list.print();
		
		printList(list);
		printList(list);
		
		Iterator<String> it1 = list.iterator();
		Iterator<String> it2 = list.iterator();
		
		System.out.println(it1.next());
		System.out.println(it2.next());
		
		for (String string : list) {
			System.out.println(string);
		}
		
	}

	private static void printList(MyList<String> list) {
		Iterator<String> it = list.iterator();
		
		while (it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}
	}

}
