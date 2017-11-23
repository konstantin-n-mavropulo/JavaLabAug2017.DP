package lesson171115;

public class Singleton {
	
	public static int x;

	final private static Singleton 
	_Instance = new Singleton();

	private Singleton() {
		// heavy calculations
		System.out.println("sigleton started");
	}

	public static Singleton instance() {
		// if (_Instance == null) {
		// synchronized (Singleton.class) {
		// if (_Instance == null) {
		// _Instance = new Singleton();
		// }
		// }
		// }
		return _Instance;
	}
	
	public String getState() {
		return "hi there";
	}

}
