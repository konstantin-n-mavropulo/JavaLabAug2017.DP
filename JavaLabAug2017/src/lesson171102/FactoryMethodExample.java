package lesson171102;

public class FactoryMethodExample {
	
	public static void main(String[] args) {
		
		A a = A.create(true);
		
	}
	

}


class A {
	
	static A create(boolean special) {
		return special? new A() {
			void change() {
				
			}
		} 	: new A();
		
	}
	
}
