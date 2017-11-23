package lesson171115;

public class ExampleStaticInstantiation {
	
	public static void main(String[] args) {
		A a;
		
		System.out.println("start");
		System.out.println("start");
		System.out.println("start");
		System.out.println("start");
		System.out.println("start");
		System.out.println("start");
		
//		A.x = 20;
		
		a = new A();
		
		System.out.println(Singleton.x);
		
	}

}


class A {
	static int x = 10;
	
	static {
		System.out.println("static init " + x);
	}
	
	{
		System.out.println("instance init " + x);
	}
	
	A() {
		System.out.println("constructor " + x);
	}
	
	
	
}