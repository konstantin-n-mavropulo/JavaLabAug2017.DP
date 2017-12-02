package lesson171129;

public class NullCheckExample {

	static A a;

	public static void main(String[] args) {

		process(new Object());
		process("hello");
		// process(null);
		process(a);

	}

	private static void process(Object o) {
		if (o == null)  // guard condition
			return;
		System.out.println(o.getClass().getName());
	}

}
